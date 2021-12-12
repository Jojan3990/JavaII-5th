package Code;

import java.sql.*;


//Create a table product with fields: id, name, vendor, price, manufacture date, expiry date

public class CreateTableDatabase {
    public static void main(String[] args) throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn;
        String url="jdbc:mariadb://localhost:3306/databaseAssignment";
        conn= DriverManager.getConnection(url,"root","root");
        if(conn!=null){
            String sql = "CREATE TABLE Product " +
                    "(id INTEGER PRIMARY KEY, " +
                    "name varchar(30), " +
                    "vendor varchar(30)," +
                    "price double,"+
                    "mandufacture_date date,"+
                    "expiry_date date)";
            Statement stmt=conn.createStatement();
            int result=stmt.executeUpdate(sql);
            System.out.println("Table created");
        }
        else{
            System.out.println("Error creating table");
        }
    }
}
