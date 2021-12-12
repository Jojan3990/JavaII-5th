package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxExample {
    JFrame f;
    JComboBoxExample(){
        f=new JFrame("ComboBox Example");
        String[] country={"Nepal","Australia","U.S.A","England","Newzealand"};
        JComboBox<String> cb=new JComboBox<>(country);
        cb.setBounds(50, 50,90,20);
        f.add(cb);
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) cb.getSelectedItem();
                System.out.println(selectedItem);
            }
        });
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JComboBoxExample();
    }
}