package swing;

import javax.swing.*;
import java.awt.*;

class JLabelDemo{
    public JLabelDemo(){
        JFrame f=new JFrame("Swing Demo");

        ImageIcon image1=new ImageIcon("earth.png");
        JLabel label1=new JLabel("starting", image1, JLabel.LEFT);
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        f.add(label1);
        f.add(new JLabel("Test"));

        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String []args){
        new JLabelDemo();
    }
}