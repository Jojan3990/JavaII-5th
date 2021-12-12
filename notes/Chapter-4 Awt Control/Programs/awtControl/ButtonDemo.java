package awtControl;

import java.awt.*;

public class ButtonDemo extends Frame {
    ButtonDemo(){
        setLayout(new FlowLayout());
        Button button1 = new Button();
        button1.setLabel("Button 1");

        Button button2 = new Button("Button 2");

        Label l1= new Label(button1.getLabel());
        Label l2= new Label(button2.getLabel());

        add(button1);
        add(button2);
        add(l1);
        add(l2);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
       new ButtonDemo();
    }
}
