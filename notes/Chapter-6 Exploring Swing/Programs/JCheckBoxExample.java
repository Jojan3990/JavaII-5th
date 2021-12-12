package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxExample {
    JCheckBoxExample() {
        JFrame f = new JFrame("CheckBox Example");
        JCheckBox checkBox1 = new JCheckBox("C++");
        JCheckBox checkBox2 = new JCheckBox("Java", true);

        JButton button = new JButton("Display");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Your selected option is :");
                if(checkBox1.isSelected()){
                    System.out.println(checkBox1.getText());
                }
                if(checkBox2.isSelected()){
                    System.out.println(checkBox2.getText());
                }
            }
        });
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(button);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new JCheckBoxExample();
    }
}