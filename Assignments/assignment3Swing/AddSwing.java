//package Assignments.assignment3Swing;

// Write a program to create a frame having a form to take 2 numbers from user and a button to add those numbers.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddSwing {
    AddSwing(){
        JFrame f=new JFrame("Learning Swing");
        JTextField ts1=new JTextField(10);
        JTextField ts2=new JTextField(10);
        JLabel l=new JLabel("    ");

        JButton b=new JButton("ADD");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int n1=Integer.parseInt(ts1.getText());
                int n2=Integer.parseInt(ts2.getText());
                int sum=(n1+n2);
//                l.setText("Sum is = "+String.valueOf(sum));
                JOptionPane.showMessageDialog(f,"sun is = "+String.valueOf(sum));
            }
        });


        f.add(ts1);
        f.add(ts2);
        f.add(b);
        f.add(l);
        f.setSize(300,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AddSwing();
    }
}
