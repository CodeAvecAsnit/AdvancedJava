package JavaSwingLab2.Question16;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    public BorderLayoutExample(){
        setLayout(new BorderLayout());
        add(new JButton("North"),BorderLayout.NORTH);
        add(new JButton("South"),BorderLayout.SOUTH);
        add(new JButton("West"),BorderLayout.WEST);
        add(new JButton("East"),BorderLayout.EAST);
        add(new JButton("Center"),BorderLayout.CENTER);
        setSize(300,300);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
