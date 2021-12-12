package assignment1.code;

import java.applet.*; // applet class is present in applet package
import java.awt.*; // contains component class which contains paint nmethod

/*
<applet code="AppletSke.class" width="500" height="200"></applet>
*/
public class AppletSke extends Applet{
    public void init(){
        System.out.println("Applet initilized");
    }
    public void start(){
        System.out.println("Applet started or execution start");
    }
    public void paint(Graphics g){
        g.drawString("Welcome to applet", 20, 10);
    } 
    public void stop(){
        System.out.println("Applet stopped");
    }
    public void detroy(){
        System.out.println("Applet destroyed");
    }

}