package JavaSwingLab2.Question21;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends Frame implements ActionListener {
    TextField tf;
    MenuBar(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button btn = new Button("Click Me");
        btn.setBounds(100,120,80,30);
        btn.addActionListener(this);

        add(btn);
        add(tf);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showInputDialog(this,"Welcome");
    }

    public static void main(String[] args) {
        new MenuBar();
    }
}
