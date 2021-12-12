package Assignments.assignment3Swing;

//write a program to  display simple interet. (Hint: formula : S.I = P* T*R /100).
// User enters the required value in textfeild.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterestSwing {
    SimpleInterestSwing(){
        JFrame f=new JFrame("LOL");
        JLabel l1=new JLabel("Enter P T and R");
        JLabel l2=new JLabel();
        JTextField t1=new JTextField(5);
        JTextField t2=new JTextField(5);
        JTextField t3=new JTextField(5);
        JButton b=new JButton("SUBMIT");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p=Integer.parseInt(t1.getText());
                int t=Integer.parseInt(t2.getText());
                int r=Integer.parseInt(t3.getText());
                int si=(p*t*r)/100;
                l2.setText("The SI is = "+String.valueOf(si));
            }
        });
        f.add(l1);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b);
        f.add(l2);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(350,400);
    }

    public static void main(String[] args) {
        new SimpleInterestSwing();
    }
}
