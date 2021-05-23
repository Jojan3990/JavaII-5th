import java.applet.*;
import java.awt.*;

/*
<applet code="Learn.class" width="800" height="400">
</applet>
*/
public class Learn extends Applet{
    public void paint(Graphics g){
        g.drawRect(10, 20, 100, 50);
        g.drawOval(150, 20, 100, 50);
    }
}