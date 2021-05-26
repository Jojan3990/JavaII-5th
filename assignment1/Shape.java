// .Write a program to  create the following shapes:
// a.Rectangle with border color Redb.
// Square with border color Blue.
// Circle with border color Green


import java.awt.*;
import java.applet.*;

/*
<applet code="Shape.class" width="1000" height="500">
</applet>
*/

public class Shape extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.RED); //this is to set color 
        g.drawRect(10, 10, 100, 50);
        g.setColor(Color.BLUE);
        g.drawRect(150, 10, 100, 100); //used rect for square with equal height and width
        g.setColor(Color.GREEN);
        g.drawOval(300, 20, 100, 100); //equal height and width for circle
    }
}
