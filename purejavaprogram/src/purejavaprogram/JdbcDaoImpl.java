package purejavaprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDaoImpl {


    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/dayone", "root", "root");
            
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}