package purejavaprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateEmployee {

	public void updateBook()
	{
		
		String url="jdbc:mysql://localhost:3307/user=root&password=root";
		String query="update dayone.employee set EMP_NAME=?,EMP_DOB=?,EMP_JOINDATE=? where EMP_ID=?";
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url);
		    System.out.println("Step-1");    
		    PreparedStatement preparedStatement=connection.prepareStatement(query);
		    System.out.println("Step-2");
		    Scanner scanner=new Scanner(System.in);
		    System.out.println("Enter Employee name");
		    String EMP_NAME=scanner.next();
		    System.out.println("Enter Employee date of birth");
		    String EMP_DOB=scanner.nextLine();
		    System.out.println("Enter Employee date of joining");
		    String EMP_JOINDATE=scanner.nextLine();
		    System.out.println("Enter Book Title");
		    int EMP_ID=scanner.nextInt();
		    preparedStatement.setString(1, EMP_NAME);
		    preparedStatement.setString(2, EMP_DOB);
		    preparedStatement.setString(3, EMP_JOINDATE);
		    preparedStatement.setInt(4, EMP_ID);
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
