package Assignments.assignment3Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Write a program that read number from a user and display the factorial of the output in text feild when user press a button.

public class FactorialSwing {
    FactorialSwing(){
        JFrame f=new JFrame("Learning swing lolll");
        JLabel l1=new JLabel("Enter number for factorial");
        JLabel l2=new JLabel();
        JTextField t1=new JTextField(5);
        JButton b=new JButton("FACT");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num=Integer.parseInt(t1.getText());
                if(num<0){
                    l2.setText("Less than o so no fact done");
                }
                else if(num==0){
                    l2.setText("The factorail is = 0");
                }
                else{
                    int fact=1;
                    for(int i=1;i<=num;i++){
                        fact=fact*i;
                    }
                    l2.setText("The factorial is = "+String.valueOf(fact));
                }
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(b);
        f.add(l2);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(300,400);
    }

    public static void main(String[] args) {
        new FactorialSwing();
    }
}
