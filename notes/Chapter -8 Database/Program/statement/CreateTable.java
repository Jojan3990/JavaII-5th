package statement;

import java.sql.*;

public class CreateTable {
    public static void main(String[] args) throws Exception{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Jdbc_example";
            Connection conn = DriverManager.getConnection(url,"root","root");
            if(conn != null) {
                String sql = "CREATE TABLE PERSON (id INTEGER , firstName VARCHAR(255), lastName VARCHAR(255), age INTEGER, PRIMARY KEY ( id ))";

                Statement stmt = conn.createStatement();
                int result = stmt.executeUpdate(sql);

                System.out.println("Created table in given database...");

           /*     if(result != 0 ) {

                } else {
                    System.out.println("Error in executing query");
                }*/
                stmt.close();
                conn.close();
            } else {
                System.out.println("Connection not established");
            }

    }
}
