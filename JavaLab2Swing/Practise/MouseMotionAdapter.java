package JavaLab2Swing.Practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseMotionAdapter extends java.awt.event.MouseMotionAdapter {

    JFrame f ;

    MouseMotionAdapter(){
        f = new JFrame("Mouse Motion Adapter");

        f.addMouseMotionListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void mouseDragged(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.ORANGE);
        g.fillOval(e.getX(),e.getY(),20,20);
    }

    public static void main(String[] args) {
        new MouseMotionAdapter();
    }
}
