package layoutManager;

import java.awt.*;
import java.awt.event.*;
public class GridBagLayoutDemo {
    private Frame f;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    private Label msglabel;
    public GridBagLayoutDemo(){
        f = new Frame("Java GridBagDemo");
        f.setSize(400,400);
        f.setLayout(new GridLayout(3, 1));
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);

        statusLabel.setSize(350,100);
        msglabel = new Label();
        msglabel.setAlignment(Label.CENTER);
        msglabel.setText("Welcome to Demo program");
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        f.add(headerLabel);
        f.add(controlPanel);
        f.add(statusLabel);
        f.setVisible(true);
    }
    private void showGridBagLayoutDemo(){
        headerLabel.setText("Layout in action: GridBagLayout");
        Panel panel = new Panel();
        panel.setBackground(Color.darkGray);
        panel.setSize(300,300);
        GridBagLayout gb = new GridBagLayout();
        panel.setLayout(gb);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new Button("Button 1"),gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new Button("Button 2"),gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipadx = 20;
        panel.add(new Button("Button 3"),gbc);

        gbc.ipadx =0;
        gbc.ipady = 0;
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new Button("Button 4"),gbc);


        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridheight = 2;
        panel.add(new Button("Button 5"),gbc);

        gbc.gridheight =1;
        gbc.gridx= 1;
        gbc.gridy =3;
        panel.add(new Button("Button 6"),gbc);

        controlPanel.add(panel);
        f.setVisible(true);
    }
    public static void main(String[] args){
        GridBagLayoutDemo  gridLayoutDemo = new GridBagLayoutDemo();
        gridLayoutDemo.showGridBagLayoutDemo();
    }
}

