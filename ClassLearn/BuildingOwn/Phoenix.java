package ClassLearn.BuildingOwn;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Phoenix{
    void defining(){
        Frame f=new Frame();
        f.setTitle("This is freePhoenix");
        f.setSize(600,300);
        f.setLayout(null);
        f.setVisible(true);

        Label l=new Label();
        l.setText("This is my application Phoenix");
        l.setBounds(200,50,600,15);
        Label l1=new Label();
        l1.setText("Enter your name");
        l1.setBounds(50,75,600,15);
//        l.setAlignment(l.CENTER);

        TextArea area=new TextArea();
        area.setBounds(180,75,200,40);
        area.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
            }
        });

        Label l2=new Label();
        l2.setText("Address");
        l2.setBounds(90,145,600,15);

        List ll=new List(2,false);
        ll.setBounds(180,145,200,30);
        ll.add("Kathmandu");
        ll.add("Biratnager");
        ll.add("Bhaktapur");

        f.add(ll);
        f.add(area);
        f.add(l1);
        f.add(l2);
        f.add(l);

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Phoenix p=new Phoenix();
        p.defining();
    }
}