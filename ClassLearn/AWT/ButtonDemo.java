package ClassLearn.AWT;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame {
    ButtonDemo(){
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        Button b1=new Button();
        b1.setLabel("Button 1");

        Button b2=new Button("Button 2");

        Label l1=new Label(b1.getLabel());
        Label l2=new Label(b2.getLabel());

        add(b1);
        add(b2);
        add(l1);
        add(l2);
        setSize(600,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonDemo();
    }
}
