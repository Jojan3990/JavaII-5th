
import java.awt.*;

public class FirstWindow extends Frame{
    FirstWindow(){
        setTitle("My first frame");
        setSize(1000,500); //setting the size of frame
        setVisible(true); // setting the boolean value to true so window is shown
    }
    public static void main(String[] args) {
        FirstWindow f=new FirstWindow();

    }
}