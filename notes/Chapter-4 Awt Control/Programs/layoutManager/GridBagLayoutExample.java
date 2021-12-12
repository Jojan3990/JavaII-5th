//package layoutManager;

import java.awt.*;


public class GridBagLayoutExample extends Frame {

    public GridBagLayoutExample() {


        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        Button button_one = new Button("Button One");
        Button button_two = new Button("Button two");
        Button button_three = new Button("Button Three");
        Button button_four = new Button("Button Four");
        Button button_five = new Button("Button Five");

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(button_one, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(button_two, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(button_three, gbc);


        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(button_four, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(button_five, gbc);

        setSize(500, 500);
        setTitle("GridBag Layout Example");
        setVisible(true);
    }

    public static void main(String[] args) {
        GridBagLayoutExample a = new GridBagLayoutExample();
    }
}
