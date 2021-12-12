package ClassLearn.tryownFun;

import java.awt.*;
import java.awt.event.*;

// import jdk.internal.org.objectweb.asm.tree.analysis.Frame;
// import java.net.http.WebSocket.Listener;
public class fun3 implements KeyListener{
    Label l;
    TextArea area;
    fun3(){
        l=new Label();
        l.setBounds(20,200,100,20);
        Frame f=new Frame("This is fun2");
        TextArea area=new TextArea();
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);
        f.add(l);
        f.add(area);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
        System.out.println("Pressed");

    }
    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
        System.out.println("Released");

    }
    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed");
        System.out.println("Typed");
    }
    public static void main(String[] args) {
        fun3 f=new fun3();
    }
    
   
}
