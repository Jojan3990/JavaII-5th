//package swing;

import javax.swing.*;

public class JTabbedPaneDemo {
    public JTabbedPaneDemo() {
        JFrame frame = new JFrame("JLabel and Icon Demi");
        frame.setSize(400, 400);

        JPanel panel1 = new JPanel();
        JLabel label = new JLabel("Hi, I am Sudip Bolakhe.");
        panel1.add(label);

        JPanel panel2 = new JPanel();
        JTextField textField = new JTextField("This is textField", 20);
        panel2.add(textField);

        JPanel panel3 = new JPanel();
        JButton button = new JButton("Click me");
        panel3.add(button);

        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Tab 1", panel1);
        jtp.addTab("Tab 2", panel2);
        jtp.addTab("Tab 3", panel3);
        frame.add(jtp);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JTabbedPaneDemo();
    }
}