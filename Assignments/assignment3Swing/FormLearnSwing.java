import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Make a form with three radio button and 5 checkboxes.

public class FormLearnSwing {
    JRadioButton rb1,rb2,rb3; // after this we define vaiable down below
    FormLearnSwing(){
        JFrame f=new JFrame("Learning Swing");
//        JRadioButton rb1=new JRadioButton();// as doing this for each is boring so we do
//        JRadioButton rb1,rb2,rb3;// doing this we need to initalize it outside constructor
        rb1 =new JRadioButton("Jojan",true);
        rb2 =new JRadioButton("Nalin");
        rb3 =new JRadioButton("Deepesh");

        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        JCheckBox ch1=new JCheckBox("Cleaning");
        JCheckBox ch2=new JCheckBox("Playing");
        JCheckBox ch3=new JCheckBox("Learning");
        JCheckBox ch4=new JCheckBox("Music");
        JCheckBox ch5=new JCheckBox("Others");

        JButton b=new JButton("NAME");
        JButton b1=new JButton("HOBBY");
        JLabel l1=new JLabel(" ");
//        b.addActionListener(this);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(rb1.isSelected()){
//                    JOptionPane.showMessageDialog(this,"Hello Jojan"); ?? why not working
                    l1.setText("Jojan Handsome");
                }
                if(rb2.isSelected()){
                    l1.setText("Nalin Chor");
                }
                if(rb3.isSelected()){
                    l1.setText("Hi Deepesh");
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(ch1.isSelected()){
//                    l2.setText(""); every checkbox needs different label so
                    System.out.println("Cleaning"); // and so on for others if you want to do it
                }
            }
        });
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(b);
        f.add(l1);
        f.add(ch1);
        f.add(ch2);
        f.add(ch3);
        f.add(ch4);
        f.add(ch5);
        f.add(b1);
//        f.setLayout(new GridLayout(1,3));
        f.setLayout(new FlowLayout());
        f.setSize(250,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FormLearnSwing();
    }
}
