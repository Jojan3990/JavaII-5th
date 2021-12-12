package ClassLearn.ExamQuestions;
//Create a awt GUI that contains a combo box and text feild.
//  When a option is selected in combo box, display it in text feild.
import java.awt.*;
import java.awt.event.*;

public class ChoiceExam {
    ChoiceExam(){
        Frame f=new Frame();
        Choice c=new Choice();
        TextField t1=new TextField(15);
        Button b=new Button("Submit");

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        c.add("Testing");
        c.add("Hacking");
        c.add("Learning");
        c.add("E-Learning");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Sitem=c.getSelectedItem();
                t1.setText(Sitem);
            }
        });

        f.add(c);
        f.add(t1);
        f.add(b);
        f.setSize(300,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        new ChoiceExam();
    }
}
