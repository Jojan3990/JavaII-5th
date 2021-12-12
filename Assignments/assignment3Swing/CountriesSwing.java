// Create a swing GUI that contains a List of countries and text feild. When a option is selected in list, display it in text feild.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountriesSwing {
//    String store;
    CountriesSwing(){
        JFrame f=new JFrame();
        JLabel l1=new JLabel();
        JTextField t1=new JTextField(10);
        String[] countries={"Nepal","India","China","Korea","Japan"};
        JList<String> list=new JList<>(countries);

        JButton b=new JButton("SHOW");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                JOptionPane.showMessageDialog(f,"you selected"+list.getSelectedValuesList());
//                String items[]= list.getSelectedValuesList().toArray(new String[0]); // this is for multiple but doesnt work correctly
//                for(int i=0;i<items.length;i++){
//                    store+=items[i]+",";
//                }
//                t1.setText(store);
                t1.setText(list.getSelectedValue());

            }
        });

        f.add(list);
        f.add(b);
        f.add(t1);
        f.setVisible(true);
        f.setSize(200,400);
        f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        new CountriesSwing();
    }
}
