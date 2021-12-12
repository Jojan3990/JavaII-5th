

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AnnonymousClassDemo extends Frame{
    Label l;
    AnnonymousClassDemo(){
        l=new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        this.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                l.setText("Mouse Clicked");
                System.out.println("Clicked");
            }
            public void mouseEntered(MouseEvent e) {
                l.setText("Mouse Entered");

            }
            public void mouseExited(MouseEvent e) {
                l.setText("Mouse Exited");
            }
            public void mousePressed(MouseEvent e) {
                l.setText("Mouse Pressed");
                System.out.println("Pressed");

            }
            public void mouseReleased(MouseEvent e) {
                l.setText("Mouse Released");
                System.out.println("Released");

            }
        });
    }


    public static void main(String[] args) {
        new AnnonymousClassDemo();
    }
}
