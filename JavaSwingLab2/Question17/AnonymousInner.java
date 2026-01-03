package JavaSwingLab2.Question17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInner extends JFrame {

    JButton btn;

    AnonymousInner(){
        btn = new JButton("Dont click");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"Are you sure");
            }
        });
        add(btn);
        setDefaultCloseOperation(3);
        setSize(200,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnonymousInner();
    }
}
