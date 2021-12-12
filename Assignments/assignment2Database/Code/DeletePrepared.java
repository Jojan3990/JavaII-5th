package Assignments.assignment2Database.Code;

import java.sql.*;

//  Write sql to delete product whose price is greater than 200.

public class DeletePrepared {
    public static void main(String[] args) throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        String url="jdbc:mariadb://localhost:3306/databaseAssignment";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null){
            String sql="DELETE FROM Product WHERE price > ?";
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setInt(1,200);
            int result=stmt.executeUpdate();
            if(result!=0){
                System.out.println("Deleted successfully");
            }
            else{
                System.out.println("Not inserted");
            }
            conn.close();
            stmt.close();
        }
        else{
            System.out.println("Error");
        }

    }
}
