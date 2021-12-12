package Database;

import java.sql.*;

public class PreparedStatementInsert {
    public static void main(String[] args) throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");
        String url="jdbc:mariadb://localhost:3306/databaseAssignment";
        Connection conn = DriverManager.getConnection(url, "root", "redhat");
        if(conn!=null){
            String sql="INSERT INTO PERSON VALUES (?,?,?,?)";
            PreparedStatement stmt=conn.prepareStatement(sql); //execute statement multiple times
            stmt.setInt(1,200);
            stmt.setString(2,"JOJAN");
            stmt.setString(3,"RAI");
            stmt.setInt(4,20);
            stmt.executeUpdate();

            System.out.println("INSERTING RECORDS INTO TABLE");
            stmt.close();
            conn.close();
        }
    }
}
