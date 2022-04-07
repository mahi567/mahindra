package purejavaprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEmployee {

	public void deleteEmployee()
	{
		String url="jdbc:mysql://localhost:3307/user=root&password=root";		
		String query="delete from dayone.employee where EMP_ID='?'";
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
		    preparedStatement.executeUpdate();
		    
		    System.out.println("Step-3");  
		    
		    connection.close();
		    System.out.println("Step-5");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
