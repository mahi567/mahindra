package purejavaprogram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Javaproject
{
//	private JdbcDaoImpl impl;
//	
//	
//	public JdbcDaoImpl getImpl() {
//		return impl;
//	}
//
//	public void setImpl(JdbcDaoImpl impl) {
//		this.impl = impl;
//	}
//
//	public Javaproject(JdbcDaoImpl impl) {
//		this.impl=impl;
//	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter 1 to Insert Customer details");
		System.out.println("Enter 2 to search Customer details");
		System.out.println("Enter 3 to update Customer details");
		System.out.println("Enter 4 to delete Customer details");
		System.out.println("=====================================");
		System.out.println("Enter the choice you want");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if(choice==1)
		{
			AddEmployee AD = new AddEmployee();
			AD.addEmployee();
		}
		else if(choice==2)
		{
			DeleteEmployee DD = new DeleteEmployee();
			DD.deleteEmployee();
		}
		else if(choice==3)
		{
			UpdateEmployee UD = new UpdateEmployee();
			UD.updateBook();
		}
		else if(choice==4)
		{
			SearchEmployee SD = new SearchEmployee();
			SD.searchEmployee();
		}
	}
}
