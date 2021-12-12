package ClassLearn.tryownFun;

import java.awt.*;
import java.awt.event.*;



public class fun2 {
    // TextArea area;
    void keyListener(){
        Label l=new Label();
        l.setBounds(20,200,100,20);
        Frame f=new Frame("This is fun2");
        TextArea area=new TextArea();
        area.setBounds(20,80,300,300);
        // area.addKeyListener(this);
            f.setVisible(true);
            f.setSize(500,250);
            f.setLayout(null);
            f.add(area);
            f.add(l);
            // thi is another way of adding method not implenting interface
        // area.addKeyListener(this);
        // KeyListener listener = new KeyAdapter()
        //     {
        //         public void keyPressed(KeyEvent e) { 
        //             System.out.println("This is key pressed to print in console");
                    
        //          }
        //     };
        area.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e) { 
                System.out.println("This is key pressed to print in console");    
                l.setText("Key pressed"); 
            }
        });
        // l.addKeyListener(new KeyAdapter(){
        //     public void keyPressed(KeyEvent e) { 
        //         l.setText("Key pressed");
        //         System.out.println("IDK man"); 
        //     }
        // });
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
            
    }
    public static void main(String[] args) {
        fun2 f=new fun2();
        f.keyListener();
    }
}
