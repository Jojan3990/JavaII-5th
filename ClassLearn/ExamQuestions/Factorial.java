package ClassLearn.ExamQuestions;

//Write a program that read number from a user and display the factorial of the output in text feild when user press a button.

import java.awt.*;
import java.awt.event.*;

public class Factorial {
    Factorial(){
        Frame f=new Frame();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Label l1=new Label("Enter Number For Factorial");
//        Label l2=new Label();
        TextField t1=new TextField(15);
        Button b=new Button("Submit");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(t1.getText());
                if(num<0){
                    t1.setText("Less than o so no fact done");
                }
                else if(num==0){
                    t1.setText("The factorail is = 0");
                }
                else{
                    int fact=1;
                    for(int i=1;i<=num;i++){
                        fact=fact*i;
                    }
                    t1.setText("The factorial is = "+String.valueOf(fact));
                }
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(b);
//        f.add(l2);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(600,400);

    }

    public static void main(String[] args) {
        new Factorial();
    }
}
