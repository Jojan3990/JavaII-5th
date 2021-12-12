package Database;

import java.sql.*;

public class CreateTable {
    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn;
        String url="jdbc:mariadb://localhost:3306/databaseAssignment";
//        String url = "jdbc:mysql://localhost:3306/databaseAssignment";
        conn = DriverManager.getConnection(url, "root", "root");
        if (conn != null){
            String sql = "CREATE TABLE PERSON" +
                    "(id INTEGER PRIMARY KEY," +
                    "firstName VARCHAR(40)," +
                    "lastName VARCHAR(40)," +
                    "age INTEGER)";

            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            System.out.println("created table");

//            if (result != 1) {
//                System.out.println("Created table");
//            } else {
//                System.out.println("Error creating database");
//            }
        } else {
            System.out.println("Error in establishing connection");
        }
    }
}
