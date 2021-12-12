package ClassLearn.ExamQuestions;

//Write a program that contains two button and a text field. When first button is clicked, a messgae "Hello world"
//  is shown in the text field, when second button is clicked text in the text field is cleared.

import java.awt.*;
import java.awt.event.*;

public class DemoLearn {
    DemoLearn(){
        Frame f=new Frame();

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        TextField t1=new TextField(10);
        Label l1=new Label();
        Button b1=new Button("Show");
        Button b2=new Button("Clear");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("Hello World");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
            }
        });

        f.setLayout(new FlowLayout());
        f.setSize(600,400);
        f.setVisible(true);

        f.add(t1);
        f.add(b1);
        f.add(b2);
    }

    public static void main(String[] args) {
        new DemoLearn();
    }
}
