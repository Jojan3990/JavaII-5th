package ClassLearn;
import java.awt.*;
import java.awt.event.*;


public class WorkWithWindow extends Frame {
    WorkWithWindow(){

        addWindowListener(new WindowAdapter(){
            // @Override
            public void windowClosing(WindowEvent e){
                System.out.println("closing");
                System.exit(0);
                // setVisible(false);
            }
        });

        setSize(500,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        WorkWithWindow n=new WorkWithWindow();
    }
}
