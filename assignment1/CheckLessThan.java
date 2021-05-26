import java.awt.*;
import java.applet.*;

// Write an applet program that takes a string as a parameterand checks 
// whether  thelength of the string is less than 6 characters or not.

/*
<applet code="CheckLessThan.class" width="300" height="100">
// <param name="var" value="Jojannn">
// </applet>
*/

public class CheckLessThan extends Applet {
    String varStr;
    int length;
    public void start(){
        varStr=getParameter("var");
        length=varStr.length();
    }
    public void paint(Graphics g){
        if(length<6){
            g.drawString("Less than 6", 0, 10);
        }
        else{
            g.drawString("Greater than 6", 0, 10);
        }
    }
}
