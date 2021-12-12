import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonDemo {
    ButtonDemo(){
        Frame f=new Frame();
        Button b1=new Button("button 1");
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.add(b1);
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonDemo();
    }
}
