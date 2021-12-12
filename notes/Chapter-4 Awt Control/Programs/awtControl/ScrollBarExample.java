package awtControl;

import java.awt.*;

class ScrollBarExample extends Frame {
    ScrollBarExample() {
        setLayout(null);

        Label lblHor = new Label("Horizontal Scrollbar");
        lblHor.setBounds(20,50,300,20);

        Scrollbar sl = new Scrollbar(Scrollbar.HORIZONTAL, 0, 30, 0, 100);
        sl.setBounds(400,50,300, 20);

        Label lblver = new Label("Vertical Scrollbar");
        lblver.setBounds(20,200,300,20);
        Scrollbar s2 = new Scrollbar(Scrollbar.VERTICAL, 50, 10, 0, 100);
        s2.setBounds(400,200,30,300);
        add(lblHor);
        add(sl);
        add(lblver);
        add(s2);
    }
    public static void main(String args[]) {
        ScrollBarExample frame = new ScrollBarExample();
        frame.setTitle("Scrollbar in Java Example");
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}

