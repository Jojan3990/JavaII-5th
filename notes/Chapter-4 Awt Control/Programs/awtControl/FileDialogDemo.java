package awtControl;

import java.awt.*;

public class FileDialogDemo {

    public FileDialogDemo() {
        Frame f = new Frame("File Dialog Demo");
        f.setVisible(true);
        f.setSize(100, 100);
        FileDialog fd = new FileDialog(f, "File Dialog");
        fd.setVisible(true);

    }

    public static void main(String[] args) {
        new FileDialogDemo();
    }
}

