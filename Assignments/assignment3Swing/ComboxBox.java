//package assignment3Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Create a swing GUI that contains a combo box and text feild. When a option is selected in combo box, display it in text feild.

public class ComboxBox {
    ComboxBox(){
        JFrame f=new JFrame();
        JTextField ts=new JTextField(10);
        String[] PeopleBand={"Freddie","Arthur","Hillsong","BTS","Halsey"};
        JComboBox<String> cb=new JComboBox<>(PeopleBand);

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String st=(String) cb.getSelectedItem(); // wht does this string do?
                ts.setText(st);
            }
        });

        f.add(cb);
        f.add(ts);
        f.setLayout(new FlowLayout());
        f.setSize(300,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboxBox();
    }
}
