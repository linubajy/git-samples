package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SQLConnection
{
	public Connection createCon()
	{
		Connection con=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ShopApp","root","ROOTPASSWORD");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return con;
	}
	

	
	
	
	
}
