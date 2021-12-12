package ClassLearn.ExamQuestions;


//Make a form with three radio button and 5 checkboxes.
import java.awt.*;
import  java.awt.event.*;

public class formDemo {
    formDemo(){
        Frame f=new Frame();

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Label l1=new Label("Choose Gender");
        l1.setAlignment(l1.CENTER);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1=new Checkbox("Male",cbg,false);
        Checkbox c2=new Checkbox("Female",cbg,false);
        Checkbox c3=new Checkbox("Others",cbg,true);

        Label l2=new Label("choose subject");
        l2.setAlignment(l2.CENTER);
        Checkbox c4=new Checkbox("PHP");
        Checkbox c5=new Checkbox("Database");
        Checkbox c6=new Checkbox("Java");
        Checkbox c7=new Checkbox("Python");
        Checkbox c8=new Checkbox("Graphics");

        f.setLayout(new GridLayout(10,1));
        f.setSize(600,400);
        f.setVisible(true);

        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(l2);
        f.add(c4);
        f.add(c5);
        f.add(c6);
        f.add(c7);
        f.add(c8);

    }

    public static void main(String[] args) {
        new formDemo();
    }
}
