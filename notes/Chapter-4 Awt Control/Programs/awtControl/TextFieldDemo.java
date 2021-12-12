package awtControl;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class TextFieldDemo {
    public TextFieldDemo() {
        TextField tx1 = new TextField();
        TextField tx2 = new TextField(10);
        TextField tx3 = new TextField("username", 5);
        TextField tx4 = new TextField("password", 20);
        Frame f = new Frame("AWT Text Field");
        f.setLayout(new GridLayout(4, 1));
        f.add(tx1);
        f.add(tx2);
        f.add(tx3);
        f.add(tx4);


        tx1.setText("Name");
        tx2.setText("Address");

        System.out.println("first textfield is:" + tx1.getText());
        System.out.println("first textfield is:" + tx2.getText());

        tx3.select(2, 5);
        System.out.println("selected text of textfield 3 is:" +      tx3.getSelectedText());

        tx1.setEditable(false);
        System.out.println(tx1.isEditable() ? "editable" : "not editable");

        tx4.setEchoChar('*');
        System.out.println("echo text is:" + tx4.getEchoChar());

        System.out.println(tx4.echoCharIsSet()? "echo was set" : "echo not set");
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldDemo();
    }

}


