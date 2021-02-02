
//input from console
//use preparedstatements for console input
//use executeupdate for ddl commands(insert) 
//retrieveing from table

import java.sql.*;
import java.util.*;


public class JDBCConsoleInput {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","ROOTPASSWORD");
	
		System.out.println("Enter the roll:");
		int roll=s.nextInt();
		System.out.println("Enter the name:");
		String name=s.next();
		System.out.println("Enter the city:");
		String city=s.next();

		//input
		String query="insert into Student values ("+roll+",'"+name+"','"+city+"')";
		PreparedStatement ps=con.prepareStatement(query);		//ddl command
		
		//retrieving result
		int c =ps.executeUpdate();								//ddl command gives int return type

		System.out.println(c+" row(s) affected");
		
		
	
		
		//input
		String query2="select * from Student  ";				//dml command
		Statement st=con.createStatement();					
		
		//retrieving set of records
		ResultSet r=st.executeQuery(query2);				
		
		
		//displaying records
		while(r.next())
		{
			String UserData=r.getInt(1)+","+r.getString(2)+","+r.getString(3);
			System.out.println(UserData);
		}
		
		con.close();
	}

}
