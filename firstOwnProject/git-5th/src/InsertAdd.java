//import java.sql.*;
//
//public class InsertAdd{
////    String name,email,gender;
////    int roll;
////    void InsertAddMain(String name,int roll,String email,String gender) throws Exception{
////        this.name=name;
////        this.roll=roll;
////        this.email=email;
////        this.gender=gender;
////    }
//    InsertAdd(String name,int roll,String email,String gender) throws Exception{
////        InsertAdd in=new InsertAdd();
//        UIDesign ui=new UIDesign();
//        Class.forName("org.mariadb.jdbc.Driver");
//        String url="jdbc:mariadb://localhost:3306/InsertAdd_fifth";
//        Connection conn = DriverManager.getConnection(url, "root", "root");
//        if(conn!=null){
//            String mainname=name;
//            int mainroll=roll;
//            String mainemail=email;
//            String maingender=gender;
//
//            String sql="INSERT INTO useradd VALUES(?,?,?,?,?)";
//            PreparedStatement stmt=conn.prepareStatement(sql);
//            stmt.setString(1, mainname);
//            stmt.setInt(2,mainroll);
//            stmt.setString(3,mainemail);
//            stmt.setString(4,maingender);
//            stmt.setInt(5,0);
//            stmt.executeUpdate();
//            System.out.println("userAdded");
//            stmt.close();
//            conn.close();
//        }
//        else{
//            System.out.println("Error while processing");
//        }
//    }
//    public static void main(String[] args) throws Exception{
//
//    }
//}
//
