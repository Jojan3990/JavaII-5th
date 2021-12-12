package layoutManager;

import java.awt.*;

public class BorderLayoutDemo {
    public BorderLayoutDemo() {
        Frame f = new Frame("Layout Demo");
        f.setLayout(new BorderLayout());

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");

        f.add(b1, BorderLayout.CENTER);
        f.add(b2, BorderLayout.EAST);
        f.add(b3, BorderLayout.WEST);
        f.add(b4, BorderLayout.NORTH);
        f.add(b5, BorderLayout.SOUTH);

//        Button b6 = new Button("6");
//        Button b7 = new Button("7");
//        Button b8 = new Button("8");
//        Button b9 = new Button("9");
//        f.add(b6, BorderLayout.PAGE_START);
//        f.add(b7, BorderLayout.PAGE_END);
//        f.add(b8, BorderLayout.LINE_START);
//        f.add(b9, BorderLayout.LINE_END);

        f.setSize(200,200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}


