package student_management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws IOException
	{
		System.out.println("--**Welcome_To_Student_Management_System**--");
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("press 1 to ADD Students");
			System.out.println("press 2 to DELETE Students");
			System.out.println("press 3 to DISPLAY Students");
			System.out.println("press 4 to UPDATE Students");
			System.out.println("press 5 to EXIT Students");
			
			int c=Integer.parseInt(bf.readLine());
			
			if(c==1)
			{
				//ADD Students
				System.out.println("Enter Student Name");
				String name=bf.readLine();
				System.out.println("Enter Student Ph-Number");
				String phnum=bf.readLine();
				System.out.println("Enter Student City");
				String city=bf.readLine();
				
				Student s=new Student(name,phnum,city);
				
				StudentDao.insertInTo(s);
				System.out.println(s);
				
				
			}else if(c==2)
			{
				//DELETE Students
				System.out.println("entere id to Delete");
				int ById=Integer.parseInt(bf.readLine());
				
				StudentDao.DeleteById(ById);
				
			}else if(c==3)
			{
				//DISPLAY Students
				StudentDao.ShowAll();;
				
			}else if(c==4)
			{
				// update
				System.out.println("entere query to updated rows");
				String up=bf.readLine();
				
				StudentDao.UpdateById(up);
				
				
			}
			else if(c==5)
			{
				//EXIT Students
				
				break;
			}
			{
				
			}
		}
		System.out.println("Thank you.......");
	}
}
