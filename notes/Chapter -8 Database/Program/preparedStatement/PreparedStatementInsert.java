package preparedStatement;

import java.sql.*;

public class PreparedStatementInsert {

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Jdbc_example";
        Connection conn = DriverManager.getConnection(url,"root","root");
        if(conn != null) {
            String sql = "INSERT INTO PERSON VALUES (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,300);
            stmt.setString(2,"test");
            stmt.setString(3,"test");
            stmt.setInt(4,20);
            stmt.executeUpdate();

            System.out.println("Inserted records into the table...");

            stmt.close();
            conn.close();
        }
    }
}
