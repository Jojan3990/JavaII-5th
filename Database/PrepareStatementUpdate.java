package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareStatementUpdate {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/free_blog_shoot";
        Connection conn = DriverManager.getConnection(url, "root", "redhat");
        if(conn!=null){
            String sql="UPDATE PERSON SET age = ? WHERE id= ? ";
//String sql="UPDATE PERSON firstName age = ? WHERE id= ? "; if i send same query from below value is updated as it typecasts
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,19); //setting id 19 update to 30
            ps.setInt(2,300);
            ps.executeUpdate();
            System.out.println("Value Updated");
            ps.close();
            conn.close();
        }
    }
}
