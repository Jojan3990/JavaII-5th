import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Write a program that contains two button and a text feild. When first button is clicked, a messgae "Hello world" is
// shown in the text 	  feild, when second button is clicked text in the textfield is cleared.

public class MagicSwing {
    MagicSwing(){
        JFrame f=new JFrame("LOLL");
        JTextField t1=new JTextField(10);
        JLabel l1=new JLabel();
        JButton b1=new JButton("Show");
        JButton b2=new JButton("Clear");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("Hello World");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
            }
        });

        f.add(t1);
        f.add(b1);
        f.add(b2);
        f.setLayout(new FlowLayout());
        f.setSize(600,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MagicSwing();
    }
}
