package Code;

import java.sql.*;

// Write sql to update the price of all product by 10%

public class Update {
    public static void main(String[] args) throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        String url="jdbc:mariadb://localhost:3306/databaseAssignment";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null){
            Statement stmt=conn.createStatement();
            String sql1="SELECT * FROM Product";
            ResultSet rs=stmt.executeQuery(sql1);
//            int num=0;
            while (rs.next()){
//                num=num+1;
                int id=rs.getInt("id");
                double p=rs.getDouble("price");
                double tmp=p*0.1;
                p=p+tmp;
//                System.out.println(p);
                String sql2="UPDATE Product SET price = "+ p +"WHERE id ="+id;
                stmt.executeUpdate(sql2);
            }
        }
        else {
            System.out.println("error");
        }
    }
}
