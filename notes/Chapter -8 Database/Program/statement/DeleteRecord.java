package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {
    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/Jdbc_example";
        Connection conn = DriverManager.getConnection(url,"root","root");

        if(conn != null) {

            String sql = "DELETE FROM PERSON where id = 100";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            stmt.close();
            conn.close();
        } else {
            System.out.println("Connection not established");
        }

    }
}
