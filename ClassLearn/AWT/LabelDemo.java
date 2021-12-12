package ClassLearn.AWT;

import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;

public class LabelDemo extends Frame {
    LabelDemo(){

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setLayout(new GridLayout(6,1));
        Label l1=new Label();
        l1.setText("This is with method call");
        Label l2=new Label("This is from  \n constructor",Label.RIGHT);
        Label l3=new Label("This is from constructor aligned");
        l3.setAlignment(Label.RIGHT);

        Label l4=new Label();
        Label l5=new Label();
        Label l6=new Label();
        l4.setText(l1.getText());
        l5.setText(l2.getText());
        l6.setText(l3.getText());
        l6.setAlignment(l3.getAlignment());

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
//        removeAll();

        setSize(600,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelDemo();
    }
}
