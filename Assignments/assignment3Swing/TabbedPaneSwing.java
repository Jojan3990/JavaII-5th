

//Write a program to open three tabbed pane where :
//        1st pane contains two text feild.
//        2nd pane contains two button.
//        3rd pane contains three label

import javax.swing.*;
import java.awt.*;

public class TabbedPaneSwing {
    TabbedPaneSwing(){
        JFrame f=new JFrame("Laerning Here");

        JPanel jp1=new JPanel();
        JTextField t1=new JTextField(10);
        JTextField t2=new JTextField(10);
        jp1.add(t1);
        jp1.add(t2);

        JPanel jp2=new JPanel();
        JButton b1=new JButton("HAHA");
        JButton b2=new JButton("HAHA");
        jp2.add(b1);
        jp2.add(b2);

        JPanel jp3=new JPanel();
        JLabel l1=new JLabel("FUN");
        JLabel l2=new JLabel("FUN");
        JLabel l3=new JLabel("FUN");
        jp3.add(l1);
        jp3.add(l2);
        jp3.add(l3);

        JTabbedPane ttt=new JTabbedPane();
//        tp.setBounds(50,50,200,200);
        ttt.add("TextField",jp1);
        ttt.add("Button",jp2);
        ttt.add("Label",jp3);
        f.add(ttt);
//        f.add(tp);
        f.setSize(800,400);
//        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneSwing();
    }
}
