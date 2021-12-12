package Code;//package Assignments.assignment2Database.Code;

import java.sql.*;


//1. Write sql to insert 5 record into product table

public class Insert {
    public static void main(String[] args) throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn;
        String url="jdbc:mariadb://localhost:3306/databaseAssignment";
        conn=DriverManager.getConnection(url,"root","root");
        if(conn!=null){
            Statement stmt=conn.createStatement();
            String sql="INSERT INTO Product VALUES (100,'Jojan','CG',2000,'2020-01-14','2021-01-14')," +
                    "(101,'Nalin','BG',200,'2019-01-14','2021-01-14')," +
                    "(102,'Dipesh','Uni',2230,'2018-04-14','2022-01-14')," +
                    "(104,'Subin','Newa',150,'2021-03-14','2023-01-14')," +
                    "(103,'Dristy','Broke',300,'2016-05-14','2024-01-14')," +
                    "(105,'Hari','Erer',10,'2019-01-14','2022-01-14')";
            int result=stmt.executeUpdate(sql);
            if(result!=0){
                System.out.println("inserted successfully");
            }
            else{
                System.out.println("Not inserted");
            }
        }
        else{
            System.out.println("error while inserting");
        }
    }
}
