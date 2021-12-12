package Database;

import java.sql.*;

public class PreparedStatementSelect {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/databaseAssignment";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null){
//            String sql="SELECT * FROM users";
            System.out.println("haha");
        }
        else{
            System.out.println("nope");
        }
    }
}
