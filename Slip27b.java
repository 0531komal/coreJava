import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Slip27b extends Frame implements ActionListener{
    Graphics g;
    List l;
    TextField t1;
    Button b1;
    Label l1;

    public Slip27b(){
        this.setLayout(new FlowLayout());
        this.setSize(300, 300);
        this.setVisible(true);

        l1 = new Label("enter directory: ");
        t1 = new TextField(20);
        l = new List(10);
        b1 = new Button("click me");

        l1.setBounds(50, 100, 80, 50);
        t1.setBounds(50, 150, 80, 80);
        b1.setBounds(50, 200, 80, 80);
        l.setBounds(50, 300, 100, 100);

        add(l1);
        add(t1);
        add(b1);
        add(l);

        b1.addActionListener(this);

        // Add a window listener to close the frame
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                dispose(); // Close the frame
            }
        });
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){
            try{
                String nm = t1.getText();
                File f1 = new File(nm);
                String s1[] = f1.list();

                if(s1 == null){
                    l.add("dir not exist");
                }else{
                    for (int i = 0; i < s1.length; i++){
                        l.add(s1[i]);
                    }
                }
            }catch(Exception e){
                //l.add("Error: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args){
        new Slip27b();
    }
}