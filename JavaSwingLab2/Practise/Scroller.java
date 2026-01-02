package JavaSwingLab2.Practise;

import javax.swing.*;

public class Scroller extends JFrame {

    public Scroller(){
        JScrollBar bar= new JScrollBar();
        this.setBounds(100,100,50,100);
        this.add(bar);
        this.setSize(400,400);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Scroller();
    }
}
