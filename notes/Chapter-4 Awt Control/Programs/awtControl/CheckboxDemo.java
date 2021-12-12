package awtControl;

import java.awt.*;

public class CheckboxDemo extends Frame {

    CheckboxDemo(){

        setLayout(new GridLayout(2, 3));
        Checkbox red = new Checkbox("Red");
        Checkbox blue = new Checkbox("Blue", true);
        Checkbox green = new Checkbox("Green",true);

        add(red);
        add(green);
        add(blue);


        CheckboxGroup gender = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", gender, false);
        Checkbox female = new Checkbox("Female", false, gender);
        Checkbox other = new Checkbox("Others",gender, true);
        add(male);
        add(female);
        add(other);

        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckboxDemo();
    }
}
