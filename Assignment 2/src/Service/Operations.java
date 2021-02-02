package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import Entity.Employee;


@SuppressWarnings("serial")
class IDExistException extends Exception
{
	IDExistException(String s)
	{
		super(s);
	}
}

@SuppressWarnings("serial")
class IDNotExistException extends Exception
{

	IDNotExistException(String s)
	{
		super(s);
	}
}


public class Operations implements ServiceInterface
{


	static Scanner s=new Scanner(System.in);
	public Operations() 
	{
		super();
	}
	
	SQLConnection sql=new SQLConnection();
	
	@Override
	public List<Employee> addEmployee(List<Employee> emp)
	{
		
		System.out.println("********************\nADDING DETAILS\n********************");
		System.out.println("Enter the ID:");
		int id=s.nextInt();
		
		
		Connection con=sql.createCon();
		
		int clear=0;
		
		try 
		{
			clear=0;
			String query="select id from Employee where id= "+id;
			Statement st=con.prepareStatement(query);
			ResultSet rs=st.executeQuery(query);
			//rs.next();
			while(rs.next())
			{
				if(rs.getInt(1)==id)
				{
					clear=-1;
					throw new IDNotExistException("Customer ID already exists!");
					
				}
			}
			
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			addEmployee(emp);
		}
		if(clear!=-1)
		{
			System.out.println("Enter the Name:");
			String name = s.next();
			System.out.println("Enter the Track:");
			String track = s.next();	
			System.out.println("Enter the Phone Number:");
			String phone = s.next();
			System.out.println("Enter the Role(student/Teacher):");
			String role = s.next();

			try 
			{
				
				String query = "insert into Employee values(?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1,id);
				ps.setString(2, name);
				ps.setString(3, track);
				ps.setString(4,phone);
				ps.setString(5, role);
				ps.executeUpdate();
				System.out.println("User Added Successfully\n\n");
				System.out.println("\n\n");
			
				con.close();
			} 
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
		return emp;
		
		
	}

	@Override
	public List<Employee> updateEmployeeSalary(List<Employee> emp) 
	{
		Connection con=sql.createCon();
		int found=0;
		System.out.println("\n********************************\nUPDATE\n********************************");
		
		System.out.println("Enter the ID to Update phone number:");
		int id=s.nextInt();

		try 
		{
			String query="select id from Employee where id= "+id;
			Statement st=con.prepareStatement(query);
			ResultSet rs=st.executeQuery(query);
			//rs.next();
			while(rs.next())
			{
				if(rs.getInt(1)==id)
				{
					found=1;
					break;
				}
			}
			
			if(found!=1)
			{
				throw new IDNotExistException("ID doesn't Exists!");
			}
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(found==1)
		{
			System.out.println("Enter the Updated Phone Number:");
			String phone=s.next();
			try
			{
				String update="update Employee set phone = "+phone+" where id = "+id+" ";
				PreparedStatement ps=con.prepareStatement(update);
				ps.executeUpdate();
				System.out.println("Phone number Updated Successfully\n\n");
				System.out.println("\n\n");
				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
				
		}

		return emp;
	}

	@Override
	public List<Employee> deleteEmployee(List<Employee> emp) 
	{
		int found=0;
		Connection con=sql.createCon();
		System.out.println("\n********************************\nDELETE ITEM\n********************************");
		System.out.println("Enter the ID to Delete:");
		int id=s.nextInt();
		try 
		{
			String query="select id from Employee where id= "+id;
			Statement st=con.prepareStatement(query);
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
			{
				if(rs.getInt(1)==id)
				{
					found=1;
					break;
				}
			}
			
			if(found!=1)
			{
				found=-1;
				throw new IDNotExistException("ID doesn't Exists!");
			}
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(found==1)
		{
			try
			{
				String query="delete from Employee where id="+id+"";
				PreparedStatement ps=con.prepareStatement(query);
				ps.executeUpdate();			
				System.out.println("ID deleted Successfully!");
				System.out.println("\n\n");
				con.close();
			}	
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		return emp;
	}

	@Override
	public List<Employee> getEmployeeCountByTrack(List<Employee> emp)
	{
		Connection con=sql.createCon();
		System.out.println("Enter the track to compute campus minds:");
		String track=s.next();
		try
		{
			String query="select count(*) as count from Employee where track='"+track+"'";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs4=ps.executeQuery();	
			
			System.out.println("COUNT");
			
			while(rs4.next())
			{
				System.out.println(rs4.getInt(1));
				
			}
			System.out.println("\n\n");
			con.close();
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		return emp;
	}

	
	

}
