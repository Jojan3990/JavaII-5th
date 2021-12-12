package statement;

import java.sql.*;

public class ConnectionDemo {
    public static void main(String args[]) throws Exception {

            // Step 1: Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Step 2: Get the connection by passing the URL
            String url = "jdbc:mysql://localhost:3306/Jdbc_example";
            Connection con = DriverManager.getConnection(url,"root","root");
            System.out.println("Connected Successfully");
            con.close();
    }
}
