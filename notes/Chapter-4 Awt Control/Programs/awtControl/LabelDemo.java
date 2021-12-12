package awtControl;

import java.awt.*;

public class LabelDemo extends Frame {

    LabelDemo(){
        setLayout(new GridLayout(6,1));

        Label l1= new Label();
        l1.setText("This is with method call");
        Label l2= new Label("This is from constructor");
        Label l3= new Label("This is from Constructor aligned", Label.RIGHT);
        Label l4= new Label();
        Label l5= new Label();
        Label l6= new Label();
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
       // removeAll();
        setSize(500,500);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelDemo();
    }
}
