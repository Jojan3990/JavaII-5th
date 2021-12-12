package ClassLearn.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceDemo {
    ChoiceDemo(){

        Frame f=new Frame("Learninig choice");
        f.setLayout(null);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Label l=new Label("Which Character do you like most ?");
        l.setBounds(10,20,200,50);
        Choice c=new Choice();
        c.add("shanks");
        c.add("naruto");
        c.add("luffy");

        c.setBounds(300,50,100,30);
        f.add(l);
        f.add(c);

        System.out.println("Currently selected is : "+c.getSelectedItem());
        System.out.println("Currently number of items in choice list are :"+c.getItemCount());
        System.out.println("value at index 2 :"+c.getItem(2));
//        c.select(1);
        f.setVisible(true);
        f.setSize(600,400);
    }

    public static void main(String[] args) {
        new ChoiceDemo();
    }
}
