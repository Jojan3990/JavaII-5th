import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceDemo {
    ChoiceDemo(){
        Frame f=new Frame();
        Label l1=new Label("Choose your band");
        Choice c1=new Choice();
        Button b1=new Button("click");
        TextField  t1=new TextField(" ",20);
        c1.add("Queen");
        c1.add("ACDC");
        c1.add("Script");
        f.add(l1);
        f.add(c1);
        f.add(b1);
        f.add(t1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t1.setText("selected is = "+c1.getSelectedItem());
            }
        });
        System.out.println("Selected is = "+c1.getSelectedItem());
        System.out.println("index is = "+c1.getItemCount());
        System.out.println("index 0 is = "+c1.getItem(0));
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(500, 500);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new ChoiceDemo();
    }
}
