package Code;

import java.sql.*;
// Write sql to show all the product.
public class Select {
    public static void main(String[] args) throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        String url="jdbc:mariadb://localhost:3306/databaseAssignment";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null){
            String sql="SELECT * FROM Product";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println("Name is : "+rs.getString("name"));
                System.out.println("vendor is : "+rs.getString("vendor"));
                System.out.println("price is : "+rs.getInt("price"));
                System.out.println("Manufacture date is : "+rs.getDate("mandufacture_date"));
                System.out.println("Expiry date is : "+rs.getDate("expiry_date"));
            }
        }
    }
}
