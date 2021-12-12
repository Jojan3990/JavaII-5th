package Code;

import java.sql.*;

//  Write sql to delete product whose price is greater than 200.

public class Delete {
    public static void main(String[] args) throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        String url="jdbc:mariadb://localhost:3306/databaseAssignment";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null){
            Statement stmt=conn.createStatement();
            String sql="DELETE FROM Product WHERE price > 200";
//            ResultSet rs=stmt.executeQuery(sql);
            int result=stmt.executeUpdate(sql);
            if(result!=0){
                System.out.println("Deleted successfully");
            }
            else{
                System.out.println("Not inserted");
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
