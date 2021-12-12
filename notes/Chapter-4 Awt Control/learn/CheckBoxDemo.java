import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxDemo {
    CheckBoxDemo(){
        Frame f=new Frame();
        Checkbox c1=new Checkbox("checkbox1",true);
        Checkbox c2=new Checkbox("checkbox2");
        f.add(c1);
        f.add(c2);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new GridLayout(1,2));
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}
