package JavaSwingLab2.Practise;

import javax.swing.*;

public class FileChooser extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("File option");
        JFileChooser jf = new JFileChooser();
        f.add(jf);
        f.setVisible(true);
        f.setSize(300,600);
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }
}
