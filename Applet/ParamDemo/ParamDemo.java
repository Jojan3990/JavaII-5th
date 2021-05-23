import java.applet.*;
import java.awt.*;
/*
<applet code="ParamDemo.class" width=300 height=100> //defines the height and width of applet
<param name=username value=Jojan>
</applet>
*/

public class ParamDemo extends Applet{
    String username;
    public void start(){
        username=getParameter("username");
    }
    public void paint(Graphics g){
        g.drawString("Username is :"+username,0,10); //0 is like (x,y) start from coordinate 0
    }
}
