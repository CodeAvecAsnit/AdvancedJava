package JavaSwingLab2.Question17;

import javax.swing.*;

public class ExternalHandler extends JFrame{
    JButton btn;

    public ExternalHandler(){
        JButton btn = new JButton("External Click");
        btn.addActionListener(new ExternaListener());
        add(btn);
        setTitle("External Event Handler");
        setDefaultCloseOperation(3);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExternalHandler();
    }
}
