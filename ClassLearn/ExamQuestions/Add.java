package ClassLearn.ExamQuestions;
//Write a program to create a frame having a form to take 2 numbers from user and a button to add those numbers.
import java.awt.*;
import  java.awt.event.*;

public class Add {
    Add(){
        Frame f=new Frame("Learning Frame");
        f.setLayout(new FlowLayout());
//        f.setLayout(new GridLayout(3,1));
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        Label l1=new Label("Enter fisrt number");
        Label l2=new Label("Enter second number");
        Label l3=new Label("    ");

        TextField t1=new TextField(10);
        TextField t2=new TextField(10);

        Button b=new Button("Add");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());
                int sum=(n1+n2);
                l3.setText("The sum is = "+String.valueOf(sum));
            }
        });


        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.add(l3);

        f.setVisible(true);
        f.setSize(300,400);
    }

    public static void main(String[] args) {
        new Add();
    }
}
