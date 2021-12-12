package ClassLearn.ExamQuestions;

//Create a awt GUI that contains a List of countries and text feild.
// When a option is selected in list, display it in text feild.
import java.awt.*;
import java.awt.event.*;

public class CountriesList {
    CountriesList(){
        Frame f=new Frame();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Label l1=new Label();
        List l=new List(3,true);
        l.add("Nepal");
        l.add("China");
        l.add("India");
        l.add("Japan");

        Button b=new Button("Show");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String store="Items selected are ";
                String items[]=l.getSelectedItems();
                for(int i=0;i<items.length;i++){
                    store+=items[i] + ", ";
                }
                l1.setText(store);
            }
        });
        f.add(l);
        f.add(b);
        f.add(l1);
        f.setSize(600,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CountriesList();
    }
}
