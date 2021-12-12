package ClassLearn.tryownFun;

import java.awt.*;
import java.awt.event.*;

public class fun4 {
    void mouse(){
//        fun4 fl=new fun4();
        Frame f=new Frame();
        f.setTitle("mouseListener Learn");
        f.setSize(600,400);
        f.setVisible(true);
        Label l=new Label();
        l.setBounds(20,200,100,20);
        f.add(l);

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("Now closing");
                System.exit(0);
            }
        });
        f.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent e){
               System.out.println("Mouse clicked");
           } 
           public void mousePressed(MouseEvent e) {
            System.out.println("Pressed");
    
        }
        });
        
    }
    public static void main(String[] args) {
        fun4 fn=new fun4();
        fn.mouse();
    }
}
