package JavaSwingLab2.Question20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ImageMover extends JFrame implements KeyListener {
    int x = 200;
    int y = 200;
    Image img;

    public ImageMover(){
        img = Toolkit.getDefaultToolkit().getImage("copy.png");
        setSize(500,500);
        setDefaultCloseOperation(3);
        setVisible(true);
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(img,x,y,this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_KP_LEFT -> x-= 10;
            case KeyEvent.VK_RIGHT -> x+=10;
            case KeyEvent.VK_UP -> y-=10;
            case KeyEvent.VK_DOWN -> y+=10;
         }
         repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new ImageMover();
    }
}
