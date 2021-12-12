package swing;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class JToggleButtonDemo {
    public JToggleButtonDemo(){
        JFrame frame = new JFrame("JLabel and Icon Demi");
        frame.setSize(200, 200);

        frame.setLayout(new FlowLayout());
        JLabel l1=new JLabel("    ");
        JToggleButton jtbtn = new JToggleButton("on/off");
        jtbtn.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
              JToggleButton button = (JCheckBox) e.getItem();
                if(jtbtn.isSelected()){
                    l1.setText("Button is on");
                }else {
                    l1.setText("Button is off");
                }
            }
        });


        frame.add(jtbtn);
        frame.add(l1);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new JToggleButtonDemo();
    }
}


