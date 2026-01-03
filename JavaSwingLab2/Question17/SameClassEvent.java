package JavaSwingLab2.Question17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SameClassEvent extends JFrame implements ActionListener {

    JButton btn;

    public SameClassEvent() {
        btn = new JButton("Click Me");
        btn.addActionListener(this);

        add(btn);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"Handled in the same class");
    }

    public static void main(String[] args) {
        new SameClassEvent();
    }
}
