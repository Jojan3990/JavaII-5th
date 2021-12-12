package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PrepareStatementUpdate {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Jdbc_example";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        if (conn != null) {
            String sql = "UPDATE PERSON SET firstName = ? WHERE id = ?" ;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,"Updated Name");
            ps.setInt(2, 300);
            ps.executeUpdate();
            System.out.println("Value updated");
            ps.close();
            conn.close();
        }
    }
}
