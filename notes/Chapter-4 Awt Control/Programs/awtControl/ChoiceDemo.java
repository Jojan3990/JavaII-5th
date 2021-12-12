package awtControl;

import java.awt.*;

public class ChoiceDemo {
    public ChoiceDemo() {
        Frame f = new Frame("AWT CHOICE DEMO");
        f.setLayout(new FlowLayout());
        Label l1 = new Label("Which fruit you like most?");
//        l1.setBounds(10, 20, 200, 50);
        Choice c1 = new Choice();
        c1.add("apple");
        c1.add("banana");
        c1.add("grapes");

//        c1.setBounds(300, 50, 100, 30);
        f.add(l1);
        f.add(c1);

        System.out.println("currently selected is:" + c1.getSelectedItem());
        System.out.println("currently number of items in choice list is:" + c1.getItemCount());
        System.out.println("value at index 2: " + c1.getItem(2));
        c1.select(1);
        f.setVisible(true);
        f.setSize(500, 500);
    }

    public static void main(String[] args) {
        new ChoiceDemo();
    }
}
