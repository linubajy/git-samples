package Service;

import java.sql.Statement;
import java.security.Timestamp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import Client.ShoppingApp;
import Entity.Customer;
import Entity.Shop;
import SQL.SQLConnection;


@SuppressWarnings("serial")
class IDNotExistException extends Exception 
{
	IDNotExistException(String s) 
	{
		super(s);
	}

}

@SuppressWarnings("serial")
class IDExistException extends Exception 
{
	IDExistException(String s) 
	{
		super(s);
	}

}




public class Operations implements ShoppingInterface 
{

	static Scanner s = new Scanner(System.in);
	SQLConnection sql = new SQLConnection();
	

	////////////////////////////////////////////////////////////////
	@Override
	public List<Customer> signUp(List<Customer> customer) 
	{
		
		int clear=0;
		System.out.println("\n\n\n*******************\nSIGN UP\n*******************");
		Connection con=sql.createCon();
		ShoppingApp app=new ShoppingApp();
		System.out.println("Enter the Customer id:");
		int id = s.nextInt();
		
		try 
		{
			clear=0;
			String query="select custId from customer where custId= "+id;
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
			signUp(customer);
		}
		if(clear!=-1)
		{
			System.out.println("Enter the Name:");
			String name = s.next();
			System.out.println("Enter the Phone Number:");
			String phone = s.next();

			try 
			{
				
				String query = "insert into Customer values(?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1,id);
				ps.setString(2, name);
				ps.setString(3, phone);
				ps.setTimestamp(4, new java.sql.Timestamp(System.currentTimeMillis()));
				ps.setFloat(5, 0);
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
		return customer;
	}

	///////////////////////////////////////////////////////////////////

	public List<Shop> bill(List <Shop> shop,List <Customer> customer)
	{
	
	
		int clear=0;
		Connection con=sql.createCon();
		char ans;
		
		System.out.println("*******************\nENTRY CHECK\n*******************");
		System.out.println("Enter the Registered ID:");
		int id=s.nextInt();
		try 
		{
			String query="select custId from customer where custId= "+id;
			Statement st=con.prepareStatement(query);
			ResultSet rs=st.executeQuery(query);
			//rs.next();
			while(rs.next())
			{
				if(rs.getInt(1)==id)
				{
					clear=1;
					System.out.println("\n\nWelcome to XYZ Shop .......Happy Shopping!\n\n");
					break;
				}
			}
			
			if(clear!=1)
			{
				throw new IDNotExistException("Customer not registered!Kindly Register");
			}
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(clear==1)
		{
			try
			{
				String query="select * from Shop";
				Statement st=con.prepareStatement(query);
				ResultSet rs=st.executeQuery(query);
				System.out.println("ID\tNAME\tPRICE(ITEM)\tQUANTITY");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
				}
				
				float amount=0;
				do
				{
					
					System.out.println("Enter the Item ID to buy:");
					int itemId=s.nextInt();
					System.out.println("Enter the quantity to buy:");
					int qty=s.nextInt();
					String buy="select pricePerItem from shop where itemId = "+itemId;
					Statement st1=con.createStatement();
					ResultSet rs1=st1.executeQuery(buy);
					rs1.next();
					amount+=(rs1.getFloat(1)*qty);
					
					System.out.println("\n\n Do you want to continue?(y/n)");
					ans=s.next().charAt(0);
								
				}while(ans!='n');
				
				System.out.println("\n\n");
				System.out.println("Amount:"+amount);
				
				String insertAmount="update Customer set billAmount = "+amount+" where CustId="+id;
				Statement st2=con.prepareStatement(insertAmount);
				st2.executeUpdate(insertAmount);	
				System.out.println("\nAmount updated!");
				
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		return shop;
		
	}

	@Override
	public List<Shop> report(List<Shop> shop)
	{
		Connection con=sql.createCon();
		System.out.println("Enter the month in number :");
		int month=s.nextInt();
		System.out.println("Enter the date :");
		int date=s.nextInt();
		
		try
		{
			String query3="Select * from Customer where date like '%0"+month+"-"+date+"%'";
			System.out.println(query3);
			Statement st=con.createStatement();
			ResultSet rs3=st.executeQuery(query3);
			//rs3.next();
			System.out.println("ID\tNAME\tPHONE\tDATE\tBILL AMOUNT");
			
			while(rs3.next())
			{
				System.out.println(rs3.getInt(1)+"\t"+rs3.getString(2)+"\t\t"+rs3.getString(3)+"\t\t"+rs3.getTimestamp(4)+"\t"+rs3.getFloat(5));
			}	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return shop;
	}

	@Override
	public List<Shop> add(List<Shop> shop)
	{
		int clear=0;
		System.out.println("******************\nADD ITEM\n******************");
		Connection con=sql.createCon();
		display(shop);
		System.out.println("Enter the ID:");
		int itemId=s.nextInt();
		
		try 
		{
			String query="select itemId from Shop where itemId= "+itemId;
			Statement st=con.prepareStatement(query);
			ResultSet rs=st.executeQuery(query);
			//rs.next();
			while(rs.next())
			{
				if(rs.getInt(1)==itemId)
				{
					clear=-1;
					break;
				}
			}
			
			if(clear==-1)
			{
				throw new IDExistException("Item Exists!");
			}
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		if(clear!=-1)
		{
			System.out.println("Enter the Item name:");
			String itemName=s.next();
			System.out.println("Enter the Price Per Item:");
			String pricePerItem=s.next();
			System.out.println("Enter the Quantity:");
			int itemQuantity=s.nextInt();
			
			try
			{
				String query="insert into Shop values(?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setInt(1, itemId);
				ps.setString(2,itemName);
				ps.setString(3,pricePerItem);
				ps.setInt(4,itemQuantity);
			
				ps.executeUpdate();		
			
				System.out.println("Item Added Successfully\n\n");
				System.out.println("\n\n");
			
				con.close();
			}	
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
		}
		
		return shop;
	}

	@Override
	public List<Shop> update(List<Shop> shop) 
	{
		Connection con=sql.createCon();
		int found=0;
		System.out.println("\n********************************\nUPDATE QUANTITY\n********************************");
		display(shop);
		System.out.println("Enter the Item ID to Update Quantity:");
		int itemId=s.nextInt();

		try 
		{
			String query="select itemId from Shop where itemId= "+itemId;
			Statement st=con.prepareStatement(query);
			ResultSet rs=st.executeQuery(query);
			//rs.next();
			while(rs.next())
			{
				if(rs.getInt(1)==itemId)
				{
					found=1;
					break;
				}
			}
			
			if(found!=1)
			{
				throw new IDExistException("Item doesn't Exists!");
			}
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(found==1)
		{
			System.out.println("Enter the Updated Quantity:");
			int itemQuantity=s.nextInt();
			try
			{
				String update="update Shop set itemQuantity = "+itemQuantity+" where itemId = "+itemId+" ";
				PreparedStatement ps=con.prepareStatement(update);
				ps.executeUpdate();
				System.out.println("Item Quantity Updated Successfully\n\n");
				System.out.println("\n\n");
				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
				
		}
		
		
	
		return shop;
	}

	@Override
	public List<Shop> delete(List<Shop> shop) 
	{
		int found=0;
		Connection con=sql.createCon();
		System.out.println("\n********************************\nDELETE ITEM\n********************************");
		display(shop);
		System.out.println("Enter the Item ID to Delete:");
		int itemId=s.nextInt();
		try 
		{
			String query="select itemId from Shop where itemId= "+itemId;
			Statement st=con.prepareStatement(query);
			ResultSet rs=st.executeQuery(query);
			//rs.next();
			while(rs.next())
			{
				if(rs.getInt(1)==itemId)
				{
					found=1;
					break;
				}
			}
			
			if(found!=1)
			{
				throw new IDExistException("Item doesn't Exists!");
			}
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			String query="delete from Shop where itemId="+itemId+"";
			PreparedStatement ps=con.prepareStatement(query);
			ps.executeUpdate();			
			System.out.println("Item deleted Successfully!");
			System.out.println("\n\n");
			con.close();
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(found!=1)
		{
			try
			{
				throw new IDNotExistException("ID for Item not found!");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		return shop;
	}

	@Override
	public List<Shop> display(List<Shop> shop)
	{
		Connection con=sql.createCon();
		
		try
		{
			String query="select * from Shop order by pricePerItem desc";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs4=ps.executeQuery();	
			
			System.out.println("ID\tNAME\t\tPRICE(1)\tQUANTITY ");
			
			while(rs4.next())
			{
				System.out.println(rs4.getInt(1)+"\t"+rs4.getString(2)+"\t\t"+rs4.getFloat(3)+"\t\t"+rs4.getInt(4)+"\t");
				
			}
			System.out.println("\n\n");
			con.close();
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		return shop;
	}
	
	
	

}
