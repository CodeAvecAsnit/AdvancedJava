package JavaSwingLab2.Question16;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample extends JFrame {

    public GridBagLayoutExample(){
        setTitle("GridBag Layout");
        setLayout(new GridBagLayout());
        var gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JButton("Button Une"),gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        add(new JButton("Button Dos"),gbc);
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JButton("Button Tres"),gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        add(new JButton("Button Qua"),gbc);

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
}
