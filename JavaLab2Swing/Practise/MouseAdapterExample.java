package JavaLab2Swing.Practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterExample extends MouseAdapter {

    JFrame f;

    MouseAdapterExample(){
        f= new JFrame("Mouse Adapter");
        f.addMouseListener(this);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.blue);
        g.fillOval(e.getX(),e.getY(),30,30);
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
