package JavaLab2Swing.Question24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorAndFileChooser extends JFrame implements ActionListener {

    JButton fileBtn, colorBtn;
    Container c;

    public ColorAndFileChooser() {

        c = getContentPane();
        c.setLayout(new FlowLayout());

        fileBtn = new JButton("File Chooser");
        colorBtn = new JButton("Color Chooser");

        fileBtn.addActionListener(this);
        colorBtn.addActionListener(this);

        c.add(fileBtn);
        c.add(colorBtn);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == fileBtn) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);
        }

        if (e.getSource() == colorBtn) {
            Color color = JColorChooser.showDialog(
                    this, "Choose a color", c.getBackground());
            if (color != null) c.setBackground(color);
        }
    }

    public static void main(String[] args) {new ColorAndFileChooser();}
}
