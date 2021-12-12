package statement;


import java.sql.*;
import java.util.Scanner;

public class UpdateRecord {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/Jdbc_example";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        if (conn != null) {
            String sql = "UPDATE PERSON SET age = 45 WHERE id = 200" ;
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Value updated");
            stmt.close();
            conn.close();
        }
    }
}
