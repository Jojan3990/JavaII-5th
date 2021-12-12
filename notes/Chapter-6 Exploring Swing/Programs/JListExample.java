package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListExample {
    JListExample() {
        JFrame f = new JFrame();
        JButton b = new JButton("Show");

        String[] cities = {"New York", "Chicago", "Houston", "Paris", "LA", "kathmandu", "New Delhi"};
        JList<String> list = new JList<>(cities);

        f.add(list);
        f.add(b);
        f.setSize(450, 450);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "You selected "+ list.getSelectedValuesList());
            }
        });
    }

    public static void main(String args[]) {
        new JListExample();
    }
}