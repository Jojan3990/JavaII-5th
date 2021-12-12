package ClassLearn;

import java.awt.*;
public class SecondWindow {
    SecondWindow(){
        Frame f=new Frame();
        f.setTitle("My second window");
        Dimension d=new Dimension(1000,500);
        f.setSize(d);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        SecondWindow s=new SecondWindow();
    }
}
