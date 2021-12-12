

import java.awt.*;
import java.awt.event.*;

public class InnerClassImplementation {
    private Frame f;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    private TextField textField;

    public InnerClassImplementation() {

        f = new Frame("Java AWT Examples");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(3, 1));
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowOpened(e);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        f.add(headerLabel);
        f.add(controlPanel);
        f.add(statusLabel);
        f.setVisible(true);
        headerLabel.setText("Listener in action: KeyListener");

        textField = new TextField(10);
        textField.addKeyListener(new CustomKeyListener());

        controlPanel.add(textField);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        InnerClassImplementation a = new InnerClassImplementation();

    }

    class CustomKeyListener implements KeyListener {
        public void keyTyped(KeyEvent e) {
        }
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                statusLabel.setText("Entered text: " + textField.getText());
            }
        }
        public void keyReleased(KeyEvent e) {
        }
    }


}

