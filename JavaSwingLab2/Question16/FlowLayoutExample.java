package JavaSwingLab2.Question16;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    public void initialize(){
        this.setLayout(new FlowLayout());
        this.add(new JButton("Button 1"));
        this.add(new JButton("Button 2"));
        this.add(new JButton("Button 3"));
        this.add(new JButton("Button 4"));
        this.add(new JButton("Button 5"));
        this.setSize(300,400);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        FlowLayoutExample layoutExample = new FlowLayoutExample();
        layoutExample.initialize();
    }
}
