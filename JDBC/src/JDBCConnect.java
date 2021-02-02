

//dml command

import java.sql.*;
import java.util.*;

public class JDBCConnect {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","ROOTPASSWORD");
		
		String query="select * from Student";
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String userData=rs.getInt(1)+" ,"+rs.getString(2)+","+rs.getString(3);
		System.out.println(userData);
		
		
	
		
		
		
		

	}

}
