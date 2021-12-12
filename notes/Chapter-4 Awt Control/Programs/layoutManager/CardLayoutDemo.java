package layoutManager;

// Java program to illustrate the CardLayout Class

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo  {
    CardLayout card;
    Button b1, b2, b3;
    CardLayoutDemo() {

    Frame frame = new Frame();
        card = new CardLayout(40, 30);
        frame.setLayout(card);
        b1 = new Button("Button One");
        b2 = new Button("Button two");
        b3 = new Button("Button three");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.next(frame);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.next(frame);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.next(frame);
            }
        });
        frame.add("a", b1);
        frame.add("b", b2);
        frame.add("c", b3);
        frame.setVisible(true);
        frame.setSize(400, 400);
    }
    public static void main(String[] args) {
     new CardLayoutDemo();
    }
}

