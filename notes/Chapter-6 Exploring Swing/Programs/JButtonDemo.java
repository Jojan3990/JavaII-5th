package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo extends JFrame implements ActionListener {

     JButtonDemo(){
         JButton  button1 = new JButton("Button1");
         JButton button2 = new JButton("Button2");
         JButton button3 = new JButton("Button3");
         button1.addActionListener(this);
         button2.addActionListener(this);
         button3.addActionListener(this);
         setLayout(new FlowLayout());
         add(button1);
         add(button2);
         add(button3);
         setVisible(true);
         setSize(500,500);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
    @Override
    public void actionPerformed(ActionEvent e) {

        String str = e.getActionCommand();
        if(str.equals("Button1")){
            System.out.println("Button 1 was clicked");
        } else   if(str.equals("Button2")){
            System.out.println("Button 2 was clicked");
        } else {
            System.out.println("Button 3 was clicked");
        }
    }

    public static void main(String[] args) {
        new JButtonDemo();
    }
}
