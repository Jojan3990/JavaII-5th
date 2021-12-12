package Code;

import java.sql.*;

// Write sql to insert 5 record into product table
public class InsertPrepared {
    public static void main(String[] args) throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        String url="jdbc:mariadb://localhost:3306/databaseAssignment";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null){
            String sql="INSERT INTO Product VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setInt(1,100);
            stmt.setString(2,"Jojan");
            stmt.setString(3,"CG");
            stmt.setInt(4,200);
            stmt.setDate(5, java.sql.Date.valueOf("2020-12-01"));
            stmt.setDate(6,java.sql.Date.valueOf("2021-12-01"));

//            stmt.setInt(1,101);
//            stmt.setString(2,"Nalin");
//            stmt.setString(3,"BG");
//            stmt.setInt(4,200);
//            stmt.setDate(5, java.sql.Date.valueOf("2019-12-01"));
//            stmt.setDate(6,java.sql.Date.valueOf("2021-12-01"));

            int result=stmt.executeUpdate();
            if(result!=0){
                System.out.println("inserted successfully");
            }
            else{
                System.out.println("Not inserted");
            }
            System.out.println("successfull");

            stmt.close();
            conn.close();
        }
        else{
            System.out.println("Error");
        }
    }
}



































































































































































































































































