import java.awt.*;
import java.awt.event.*;


public class AdapterDemo extends Frame {
    Label l;

    AdapterDemo() {
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        this.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                l.setText("Mouse Released");
                System.out.println("Released");

            }
            public void mousePressed(MouseEvent e) {
                l.setText("Mouse Pressed");
                System.out.println("Pressed");

            }
        });
    }


    public static void main(String[] args) {
        new AdapterDemo();
    }
}
