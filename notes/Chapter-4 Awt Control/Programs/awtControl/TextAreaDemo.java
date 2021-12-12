package awtControl;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaDemo extends Frame {
    public TextAreaDemo() {
        setSize(400, 400);
        setLayout(new GridLayout(3, 2));
        TextArea ta1 = new TextArea();
        TextArea ta2 = new TextArea("put your suggestion");
        TextArea ta3 = new TextArea("Please put your comment",4,4, TextArea.SCROLLBARS_VERTICAL_ONLY);

        TextArea ta4 = new TextArea("Please put your suggestion", 6, 9, TextArea.SCROLLBARS_HORIZONTAL_ONLY);
        Label comment = new Label("Comment");
        Label suggestion = new Label("Suggestion");
        add(comment);
        add(ta1);
        add(suggestion);
        add(ta2);
        add(ta3);
        add(ta4);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaDemo();
    }
}


