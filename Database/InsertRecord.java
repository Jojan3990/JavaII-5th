//package Database;

import java.sql.*;

public class InsertRecord {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/free_blog_shoot";

        Connection conn = DriverManager.getConnection(url, "root", "redhat");
        if(conn!=null){
            Statement stmt=conn.createStatement();
            //execute a query
            System.out.println("Inserting records in table");

            String sql="INSERT INTO PERSON VALUES (100,'ZARA','ALI',20)";
            int result=stmt.executeUpdate(sql);
            if(result!=0){
                System.out.println("inserted successfully");
            }
            else{
                System.out.println("Not inserted");
            }
        }
        else{
            System.out.println("Connection not established");
        }
    }
}
