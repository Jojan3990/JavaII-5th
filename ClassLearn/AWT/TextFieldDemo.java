package ClassLearn.AWT;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldDemo  {
    TextFieldDemo(){


        TextField tx1=new TextField();
        TextField tx2=new TextField(10);
        TextField tx3=new TextField("username",5); // col is used to deine no of col but it increases with required
        TextField tx4=new TextField("password",20);
        Frame f=new Frame("This is learning text field");
//        f.setLayout(new FlowLayout());
        f.setLayout(new GridLayout(4,1));
        f.add(tx1);
        f.add(tx2);
        f.add(tx3);
        f.add(tx4);
        tx1.setText("Name");
        tx2.setText("Address");
        f.setSize(600,400);
//        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new TextFieldDemo();
    }
}
