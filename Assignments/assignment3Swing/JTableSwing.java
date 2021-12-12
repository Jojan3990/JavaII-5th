
import javax.swing.*;

public class JTableSwing {
    JTableSwing(){
        JFrame f=new JFrame();
        String[] head={"Name","Faculty"};
        String[][] data={
                {"Jojan","BIM",},
                {"Nalin","BIM",},
                {"Subin","BIT"},
        };

        JTable ht=new JTable(data,head);
        f.add(ht);
        f.setSize(400,200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JTableSwing();
    }
}
