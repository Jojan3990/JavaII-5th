package statement;

import java.sql.*;

public class InsertRecord {

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Jdbc_example";
        Connection conn = DriverManager.getConnection(url,"root","root");
        if(conn != null) {
            String sql = "INSERT INTO PERSON VALUES (100, 'Zara', 'Ali', 18)";

            Statement stmt = conn.createStatement();
            // Execute a query
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

            stmt.close();
            conn.close();
        }
    }
}
