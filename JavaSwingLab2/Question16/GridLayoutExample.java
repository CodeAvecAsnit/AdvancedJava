package JavaSwingLab2.Question16;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    public GridLayoutExample() {
        setTitle("Grid Layout");
        setLayout(new GridLayout(3, 3, 4, 5));
        for (int i = 0; i < 6; ++i) {
            add(new JButton("Button " + i));
        }
        setSize(300, 200);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
