package tryownFun;

// import jdk.internal.org.objectweb.asm.tree.analysis.Frame;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

public class learn1 {
    void testFrame(){
        Frame f=new Frame();
        // TextField tf=new TextField();
        // tf.setBounds(50,50, 150,20);
        f.setTitle("My name is Jojan");
        f.setSize(1000, 500);
        f.setVisible(true);
        f.setLayout(null); // question
        Button b=new Button("Koshis");
        b.setBounds(50,100,60,30);
        f.add(b);
        // b.addActionListener(new ActionListener(){

        //     public void actionPerformed(ActionEvent e){
        //         tf.setText("Action event processed.");
        //     }

        // });

        f.addWindowListener(new WindowAdapter(){ // this is anonymous way of implementation  
            public void windowClosing(WindowEvent e){ //this triggers window event when click on cross button
                System.out.println("we are closing window");
                System.exit(0);
            }
            public void windowActivated(WindowEvent arg0){
                System.out.println("This is activated state");
                // TextField tf=new TextField();
                // tf.setBounds(50,50, 150,20);
                // tf.setText("This is text string");
            }
        });
    }
    // this is for learning

    // void testCloseFrame(){
    //     System.out.println("Closing frame");
    //     setVisible(false);
    //     // System.exit(0); //if you want to exit the program
    // }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            learn1 l=new learn1();
            int choice;
            do{
                System.out.println("Enter number 1 for show frame \n 2 for invisble frame magic \n 3 for exit");
                choice=sc.nextInt();
                if(choice==1){
                l.testFrame();
                }
                else{
                    // l.testCloseFrame();
                }
            }while(choice==3);
            sc.close();
        }
}
