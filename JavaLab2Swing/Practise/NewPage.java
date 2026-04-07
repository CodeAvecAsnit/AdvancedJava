package JavaLab2Swing.Practise;

import javax.swing.*;

public class NewPage extends JFrame {

    JLabel l;

    NewPage(String data){
        l = new JLabel(data);
        setTitle("New Page");
        setDefaultCloseOperation(3);
        setSize(300,300);
        add(l);
        setLocationRelativeTo(null);
        setVisible(false);
    }

}
