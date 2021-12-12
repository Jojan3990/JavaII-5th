package Assignments.assignment2Database.Code;

import java.sql.*;

// Write sql to update the price of all product by 10%

public class UpdatePrepared {
    public static void main(String[] args) throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        String url="jdbc:mariadb://localhost:3306/databaseAssignment";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        if (conn!=null){
            String sql="UPDATE Product SET price = ? WHERE id = ?";
            PreparedStatement stmt=conn.prepareStatement(sql);
            String sql1="SELECT * FROM Product";
            ResultSet rs=stmt.executeQuery(sql1);
            while (rs.next()){
                int id=rs.getInt("id");
                double p=rs.getDouble("price");
                double tmp=p*0.1;
                p=p+tmp;
                stmt.setDouble(1,p);
                stmt.setInt(2,id);
                stmt.executeUpdate();
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
