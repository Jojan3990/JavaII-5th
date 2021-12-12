package ClassLearn.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxDemo extends Frame {
    CheckboxDemo(){
        setLayout(new GridLayout(2,3));
        Checkbox Haki=new Checkbox("Haki");
        Checkbox Pistol=new Checkbox("Pistol");
        Checkbox Bazooka=new Checkbox("Bazooka");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add(Haki);
        add(Pistol);
        add(Bazooka);

        CheckboxGroup Hobbies=new CheckboxGroup();
        Checkbox Sing =new Checkbox("Sing",Hobbies,false);
        Checkbox Guitar =new Checkbox("Guitar",false,Hobbies);
        Checkbox Games =new Checkbox("Games",Hobbies,true);
        add(Sing);
        add(Guitar);
        add(Games);

        setSize(600,400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CheckboxDemo();
    }
}
