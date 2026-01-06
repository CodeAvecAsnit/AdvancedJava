package JavaSwingLab2.Practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorChooser extends JFrame implements ActionListener {

    JButton jb;
    Container c;

    public ColorChooser() {
        c = getContentPane();
        c.setLayout(new FlowLayout());

        jb = new JButton("Color");
        jb.addActionListener(this);
        c.add(jb);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color initialColor = c.getBackground();
        Color color = JColorChooser.showDialog(
                this, "Select a color", initialColor);
        if (color != null) {
            c.setBackground(color);
        }
    }

    public static void main(String[] args) {
        ColorChooser ch = new ColorChooser();
        ch.setTitle("Color Chooser");
        ch.setSize(400, 400);
        ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ch.setVisible(true);
    }
}
