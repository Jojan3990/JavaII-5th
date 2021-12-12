//package swing;

import javax.swing.*;


public class JTableDemo extends JFrame{

    public JTableDemo() {

        String[] colhead = {"Name", "Address", "Phone number"};
        String[][] data = {
                {"Ram", "kathmandu", "9841111111"},
                {"Shyam", "Lalitpur", "9841222222"}
        };
        JTable table=new JTable(data,colhead);
        add(table);
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args) {
        new JTableDemo();
    }
}

