//package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JRadioButtonExample extends JFrame implements ActionListener {
    JRadioButton rb1, rb2,rb3;
    JButton b;

    JRadioButtonExample() {
        rb1 = new JRadioButton("Male",true);
        rb2 = new JRadioButton("Female");
        rb3 = new JRadioButton("Other");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        b = new JButton("click");
        b.addActionListener(this);

        add(rb1);
        add(rb2);
        add(rb3);
        add(b);
        setSize(300, 300);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {


            System.out.println(e.getSource() == b);

        if (rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "You are Male.");
        }
        if (rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "You are Female.");
        }

        if (rb3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Your gender is not specified.");
        }
    }

    public static void main(String args[]) {
        new JRadioButtonExample();
    }
}
