package Assignments.assignment1.code;//package practice.assignment;

// Write an applet program that takes a string as a parameter and 
// checks whether  thelength of the string is less than 6 characters ornot.

import java.awt.*;
import java.applet.*;

/*
<applet code="DisplayField.class" width="300" height="100">
<param name="name" value="Jojan">
<param name="roll" value="3990">
<param name="email" value="raijozan2443@gmail.com">
</applet>
*/
public class DisplayField extends Applet{
    String name,roll,email;
    public void start(){
        name=getParameter("name"); //this assigns parameter value to variable
        roll=getParameter("roll");
        email=getParameter("email");
    }
    public void paint(Graphics g){
        g.drawString("Name is : "+name,0,10); 
        g.drawString("roll is : "+roll,0,20);
        g.drawString("email is : "+email,0,30);
}
} 
