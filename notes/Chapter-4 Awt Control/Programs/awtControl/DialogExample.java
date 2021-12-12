package awtControl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogExample {

    DialogExample() {

        Frame f = new Frame("Main frame");
        Button button = new Button("Show");
        f.add(button);

        Dialog d = new Dialog(f, "Dialog Example", false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setVisible(true);
            }
        });

        d.setLayout(new FlowLayout());
        Button b = new Button("OK");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               d.setVisible(false);
            }
        });
        Label label = new Label("Click button to continue.");
        d.add(label);
        d.add(b);
        d.setSize(300, 300);

        f.setSize(500,500);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new DialogExample();
    }
}
