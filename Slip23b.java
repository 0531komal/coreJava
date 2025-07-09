// import java.awt.event.*;
// import javax.swing.*;

// public class Slip23b extends JFrame{
//     public static void main(String[] args){
//         new Slip23b();
//     }
    
//     public Slip23b(){
//         this.setSize(400,400);
//         this.setLocation(200,200);

//         JMenuBar menubar = new JMenuBar();
//         JMenu filemenu = new JMenu();
//         JMenu editmenu = new JMenu();
//         JMenu searchmenu = new JMenu();

//         JMenuItem openitem = new JMenuItem("open");
//         JMenuItem saveitem = new JMenuItem("save");
//         JMenuItem quititem = new JMenuItem("quit");

//         JMenuItem undoitem = new JMenuItem("undo");
//         JMenuItem redoitem = new JMenuItem("redo");
//         JMenuItem cutitem = new JMenuItem("cut");
//         JMenuItem copyitem = new JMenuItem("copy");
//         JMenuItem pasteitem = new JMenuItem("paste");
        

//         filemenu.add(openitem);
//         filemenu.add(saveitem);
//         filemenu.add(quititem);

//         editmenu.add(undoitem);
//         editmenu.add(redoitem);
//         editmenu.add(cutitem);
//         editmenu.add(copyitem);
//         editmenu.add(pasteitem);

//         menubar.add(filemenu);
//         menubar.add(editmenu);
//         menubar.add(searchmenu);

//         this.setJMenuBar(menubar);
//         this.setVisible(true);
//     }
// }

import java.awt.event.*;
import javax.swing.*;

public class Slip23b extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Slip23b());
    }

    public Slip23b() {
        this.setSize(400, 400);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menubar = new JMenuBar();
        JMenu filemenu = new JMenu("File");
        JMenu editmenu = new JMenu("Edit");
        JMenu searchmenu = new JMenu("Search");

        JMenuItem undoitem = new JMenuItem("Undo");
        JMenuItem redoitem = new JMenuItem("Redo");
        JMenuItem cutitem = new JMenuItem("Cut");
        JMenuItem copyitem = new JMenuItem("Copy");
        JMenuItem pasteitem = new JMenuItem("Paste");

        editmenu.add(undoitem);
        editmenu.add(redoitem);
        editmenu.add(cutitem);
        editmenu.add(copyitem);
        editmenu.add(pasteitem);

        menubar.add(filemenu);
        menubar.add(editmenu);
        menubar.add(searchmenu);

        this.setJMenuBar(menubar);
        this.setVisible(true);
    }
}
