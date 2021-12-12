package ClassLearn.tryownFun;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Fun5list{
    void listLearn(){
        Frame f=new Frame();
        f.setTitle("Learning List");
        f.setSize(600,300);
        f.setVisible(true);
        f.setLayout(null);
        Button b=new Button();
        f.add(b);
        b.setBounds(80,200,80,40);

        Label l=new Label();
        l.setAlignment(l.CENTER);
        l.setSize(500, 100);
        // l.setBounds(90,200,70,70);
        f.add(l);

        List l1=new List();
        l1.setBounds(100, 100, 70, 70);
        l1.add("Jojan");
        l1.add("Nalin");
        l1.add("Dristy");
        l1.add("Subin");
        f.add(l1);

        List l2=new List(2,true);
        l2.setBounds(300, 100, 70, 70);
        l2.add("Jojan");
        l2.add("Nalin");
        l2.add("Dristy");
        l2.add("Subin");
        f.add(l2);

        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String data ="Selected data is "+l1.getItem(l1.getSelectedIndex());
                System.out.println(data);
                l.setText(data);
            }

        });

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Fun5list f=new Fun5list();
        f.listLearn();
    }
}