package  layoutManager;

import java.awt.*;

public class FLowLayoutDemo extends Frame {

    FLowLayoutDemo(){
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEADING, 50,50);
        setLayout(flowLayout);
        Button button1 = new Button();
        button1.setLabel("Button 1");

        Button button2 = new Button("Button 2");

        Label l1= new Label(button1.getLabel());
        Label l2= new Label(button2.getLabel());

        add(button1);
        add(button2);
        add(l1);
        add(l2);
        setSize(400,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FLowLayoutDemo();
    }
}
