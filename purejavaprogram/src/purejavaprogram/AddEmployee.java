package purejavaprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddEmployee {

	public void addEmployee()
	{
		
		String url="jdbc:mysql://localhost:3307/user=root&password=root";
		String query="insert into dayone.employee values(?,?,?,?)";
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
		    System.out.println("Enter Employee Nme");
		    String EMP_NAME=scanner.next();
		    System.out.println("Enter Employee Date of birth");
		    String EMP_DOB=scanner.next();
		    System.out.println("Enter Employee date of joining");
		    String EMP_JOINDATE=scanner.next();
		    
		    preparedStatement.setInt(1, EMP_ID);
		    preparedStatement.setString(2, EMP_NAME);
		    preparedStatement.setString(3, EMP_DOB);
		    preparedStatement.setString(4, EMP_JOINDATE);
		    
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
