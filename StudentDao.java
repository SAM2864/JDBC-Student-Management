package student_management;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public static void insertInTo(Student s)
	{
		//adding student details
		try
		{
			String query="insert into students(sname,sphone,scity)values(?,?,?)";
			
			Connection conn=ConnectionClass.create();
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1, s.getStudentName());
			ps.setString(2, s.getStudentPhone());
			ps.setString(3, s.getStudentCity());
			
			ps.executeUpdate();
			System.out.println("Added successfully...............");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("..................................................");
	}

	public static void DeleteById(int ById) {
		// TODO Auto-generated method stub
		
		try
		{
			String query="delete from students where sid=?";
			
			Connection conn=ConnectionClass.create();
			
			//parameterized query we go for PreparedStatement 
			PreparedStatement ps=conn.prepareStatement(query);
			
			ps.setInt(1,ById);
			ps.executeUpdate();
			
			System.out.println("Deleted successfully...............");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void ShowAll() {
		// TODO Auto-generated method stub
		
		try
		{
			String query="select * from students";
			
			Connection conn=ConnectionClass.create();
			
			//non-parameterized query we go for Statement 
			Statement st=conn.createStatement();
			
			//show the data we use result_set
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next())
			{
				String sname=rs.getString("sname");
				
				System.out.println("Student Name= "+sname);
				System.out.println("-------------------------------");
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void UpdateById(String up)
	{
		try {
			Connection conn=ConnectionClass.create();
			
			Statement st=conn.createStatement();
			st.executeUpdate(up);
			
			System.out.println("updated...............");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
