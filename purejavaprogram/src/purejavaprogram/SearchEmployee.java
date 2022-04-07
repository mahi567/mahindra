package purejavaprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchEmployee {

	public void searchEmployee()
	{
		
		String url="jdbc:mysql://localhost:3307/user=root&password=root";
		String query="select * from dayone.employee where EMP_ID''";
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url);
		    System.out.println("Step-1"); 
		    
		    PreparedStatement preparedStatement=connection.prepareStatement(query);
		    System.out.println("Step-2");
		    
		    Scanner scanner=new Scanner(System.in);
		    System.out.println("Enter Employee ID");
		    int EMP_ID=scanner.nextInt();
		    preparedStatement.setInt(1, EMP_ID);
		    ResultSet resultset = preparedStatement.executeQuery();
		    
		    System.out.println("Step-3");
		    resultset.next();
		  String dname=resultset.getString("EMP_NAME");
		  String dob=resultset.getString("EMP_DOB");
		  String doj=resultset.getString("EMP_JOINDATE");
		 
		  System.out.println("Employee Name is : "+dname);
		  System.out.println("Employee DOB is : "+dob);
		  System.out.println("Employee DOJ is : "+doj);
		  
		  connection.close();
		  System.out.println("Step-5");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
