import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class UIDesign extends JFrame {

    String addName,addEmail,addGender;
    JPanel pa1,pa2,pa3,pa4;
    int addRoll;
    JTextField tf1,tf2,tf3,ts1,ts2,td1,td2;
    JButton b2,search;
    JRadioButton rb1,rb2,rb3;
    JLabel ls1,ls2,ld1,ld2;
    JFrame f=new JFrame();
    JDialog d=new JDialog(f,"result");
    JDialog d1=new JDialog(f,"result");
    JDialog d2=new JDialog(f,"result");
    JDialog d3=new JDialog(f,"result");

    public UIDesign(){
        pa1=new JPanel();
        pa2=new JPanel();
        pa3=new JPanel();
        pa4=new JPanel();

        JTabbedPane jtp=new JTabbedPane();
        jtp.add("Add",pa1);
        jtp.add("View",pa2);
        jtp.add("Delete",pa3);
        jtp.add("Search",pa4);

//        Logic for Add Panel
        tf1=new JTextField(20);
        tf2=new JTextField(20);
        tf3=new JTextField(20);
        rb1=new JRadioButton("Male",true);
        rb2=new JRadioButton("Female");
        rb3=new JRadioButton("Others");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        JButton b=new JButton("AddUser");
        JLabel l1=new JLabel("Name : ");
        JLabel l2=new JLabel("Roll : ");
        JLabel l3=new JLabel("Email : ");
//        JLabel l4=new JLabel("Enter Your Details");
        // Here is main Logic

        try{
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    String gender;
                    addName=tf1.getText();
                    String rol=tf2.getText();
                    addRoll=Integer.parseInt(rol);
                    addEmail=tf3.getText();
                    if(rb1.isSelected()){ addGender="male";}
                    else if(rb2.isSelected()){ addGender="female";}
                    else{ addGender="others";}
                    tf1.setText(" ");
                    tf2.setText(" ");
                    tf3.setText(" ");
                    try {
                        InsertAdd(addName,addRoll,addEmail,addGender);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        catch (Exception e){
            System.out.println(e);
        }

        // main logic end

        b2=new JButton("View");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    viewInfo();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // for delete

        ld1=new JLabel("Name");
        ld2=new JLabel("Roll");
        td1=new JTextField(20);
        td2=new JTextField(20);
        JButton buttond=new JButton("Delete");
        pa3.add(ld1);
        pa3.add(td1);
        pa3.add(ld2);
        pa3.add(td2);
        pa3.add(buttond);

        buttond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name=td1.getText();
                String roll=td2.getText();
                int rol_l=Integer.parseInt(roll);
                try {
                    deleteInfo(name,rol_l);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        // for delete end

        // for search

        ls1=new JLabel("Name");
        ts1=new JTextField(20);
        ls2=new JLabel("Roll");
        ts2=new JTextField(20);
        JButton search=new JButton("Search");
        pa4.add(ls1);
        pa4.add(ts1);
        pa4.add(ls2);
        pa4.add(ts2);
        pa4.add(search);

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name=ts1.getText();
                String roll=ts2.getText();
                int rol_l=Integer.parseInt(roll);
                try {
                    searchInfo(name,rol_l);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


//        pa4.setLayout(new Gr);

        // search end

//        pa1.add(l4);
        pa1.add(l1);
        pa1.add(tf1);
        pa1.add(l2);
        pa1.add(tf2);
        pa1.add(l3);
        pa1.add(tf3);
        pa1.add(rb1);
        pa1.add(rb2);
        pa1.add(rb3);
        pa1.add(b);

        pa2.add(b2);

//        pa1.setLayout(new FlowLayout());

        add(jtp);
        setSize(300,500);
        setVisible(true);
    }

    void InsertAdd(String name,int roll,String email,String gender) throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://localhost:3306/InsertAdd_fifth";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        if (conn != null) {
            String mainname = name;
            int mainroll = roll;
            String mainemail = email;
            String maingender = gender;

            String sql = "INSERT INTO useradd(name,roll,email,gender,udelete) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, mainname);
            stmt.setInt(2, mainroll);
            stmt.setString(3, mainemail);
            stmt.setString(4, maingender);
            stmt.setInt(5, 0);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } else {
            System.out.println("Error while processing");
        }
        JLabel added=new JLabel("Successfully added");
        added.setHorizontalAlignment(JLabel.CENTER);
        added.setVerticalAlignment(JLabel.CENTER);
        d1.add(added);
        d1.setSize(300,300);
        d1.setVisible(true);
    }
    //      Logic end for Add Panel

    //logic for view panel


    void viewInfo() throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://localhost:3306/InsertAdd_fifth";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        int overall=0;
        int ii=0;

        if (conn != null) {
            String sql = "select * from useradd where udelete=0";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet rst = stmt.executeQuery(sql);
//            rs.last();
            boolean b=rst.last();
            int row=rst.getRow();
                //defining row and column
            ResultSetMetaData rsmd = rs.getMetaData();
            int column_count = rsmd.getColumnCount();
            String view_data[][]=new String[row][column_count];

            String[] head = {"user_id","Name","email","gender"};
            int j=0;
            while (rs.next()){
                int i=0;
                int id_da=rs.getInt("user_id");
                String user_id=String.valueOf(id_da);
                view_data[j][i]=user_id;
                view_data[j][++i]=rs.getString("name");
                view_data[j][++i]=rs.getString("email");
                view_data[j][++i]=rs.getString("gender");
                i=0;
                ++j;
                }
            JTable table_view=new JTable(view_data,head);
            d3.add(table_view);
            d3.setVisible(true);
            d3.setSize(1000,400);
        }
        else{
            System.out.println("Error while processing");
        }
    }

    void deleteInfo(String name,int roll) throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://localhost:3306/InsertAdd_fifth";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        if(conn!=null){
            String sql = "select * from useradd";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String namehere = rs.getString("name");
                int rollhere = rs.getInt("roll");
                if(name.equals(namehere) && roll==rollhere){
                    String mainsql="update useradd set udelete=1 where roll="+rollhere;
                    stmt.executeUpdate(mainsql);
                    conn.close();
                    break;
                }
            }
        }
        else{
            System.out.println("Error occured");
        }
        JLabel deleted=new JLabel("Successfully Deleted");
        deleted.setHorizontalAlignment(JLabel.CENTER);
        deleted.setVerticalAlignment(JLabel.CENTER);
        d2.add(deleted);
        d2.setSize(300,300);
        d2.setVisible(true);
    }

    void searchInfo(String name,int roll) throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://localhost:3306/InsertAdd_fifth";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        String data[][]= new String[1][4];
        if (conn != null) {
            String sql = "select * from useradd where udelete=0";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String namehere = rs.getString("name");
                int rollhere = rs.getInt("roll");
                String mailhere=rs.getString("email");
                System.out.println(namehere);
                if(name.equals(namehere) && roll==rollhere){
                    int user_idshow=rs.getInt("user_id");
                    String user_id=Integer.toString(user_idshow);
                    String nameshow=rs.getString("name");
                    String gendershow=rs.getString("gender");
                    data[0][0]=user_id;
                    data[0][1]=nameshow;
                    data[0][2]=gendershow;
                    data[0][3]=mailhere;
                    break;
                }
            }
            String head[]={"u_id","name","gender","mail"};
            JTable table=new JTable(data,head);
            d.add(table);
            d.setVisible(true);
            d.setSize(600,200);
        }
        else{
            System.out.println("Error while processing");
        }
    }
    public static void main(String[] args){
        new UIDesign();
    }
}

