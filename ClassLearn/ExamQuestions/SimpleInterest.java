package ClassLearn.ExamQuestions;

//write a program to  display simple interet. (Hint: formula : S.I = P* T*R /100)

import java.awt.*;
import java.awt.event.*;

public class SimpleInterest {
    SimpleInterest(){
        Frame f=new Frame();

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Label l1=new Label("Enter P T and R");
        Label l2=new Label();
        TextField t1=new TextField(5);
        TextField t2=new TextField(5);
        TextField t3=new TextField(5);
        Button b=new Button("SUBMIT");

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
        f.setSize(600,400);
    }

    public static void main(String[] args) {
        new SimpleInterest();
    }
}
