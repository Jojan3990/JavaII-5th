import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogBox {
    DialogBox(){
        Frame f=new Frame();
        Button b1=new Button("click me");
        Dialog d1=new Dialog(f,"Learning",false);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                d1.setVisible(true);
            }
        });
        d1.setSize(400,400);
        d1.setLayout(new FlowLayout());
        Button b2=new Button("Close");
        d1.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                d1.setVisible(false);
            }
        });
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
        f.setSize(500,500);
    }

    public static void main(String[] args) {
        new DialogBox();
    }
}
