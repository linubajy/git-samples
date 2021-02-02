


//inserting into table-ddl command
import java.sql.*;
import java.util.Scanner;


public class JDBCInsert 
{
	public static void main(String args[]) throws Exception
	{
		Scanner s=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","ROOTPASSWORD");
	
		
		
		String query="insert into Student values (2,'bajy','banglore')";
		
		Statement st=con.createStatement();
	
		
		//execute update return int 
		int c =st.executeUpdate(query);
		System.out.println(c+"rows affected");
		
		
	}
	

}
