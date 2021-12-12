package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {
    public static void main(String[] args) throws Exception {

        //step 1: Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // step 2:Get the conncetion by passing the URL
        String url="jdbc:mysql://localhost:3306/free_blog_shoot";
        Connection con= DriverManager.getConnection(url,"root","redhat");
        System.out.println("Connected Successfully");
        con.close();
    }
}
