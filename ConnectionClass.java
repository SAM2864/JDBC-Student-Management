package student_management;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
	
	//to store the Connectin we created Connection con
	public static Connection con;

	public static Connection create()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String url="jdbc:mysql://localhost:3306/student_management";
			 String userName="root";
			 String password="root123";
			
			con=DriverManager.getConnection(url, userName, password);
			
			
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
		
	}
}
