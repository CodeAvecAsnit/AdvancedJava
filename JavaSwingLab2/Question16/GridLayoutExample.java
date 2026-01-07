package JavaSwingLab2.Question16;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    public GridLayoutExample() {
        setTitle("Grid Layout");
        setLayout(new GridLayout(5, 2, 4, 5));
        for (int i = 0; i < 10; ++i) {
            add(new JButton("Button " + (i+1)));
        }
        setSize(300, 200);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
