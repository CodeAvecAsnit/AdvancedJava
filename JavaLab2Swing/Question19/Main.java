package JavaLab2Swing.Question19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame  implements WindowListener, ItemListener{

    JLabel msg;
    JCheckBox cb,cb2;
    JTextField tf;

    public Main(){
        setTitle("Event handling");
        setSize(500,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);

        msg = new JLabel("Perform events");
        cb = new JCheckBox("Java");
        cb2 = new JCheckBox("Python");
        tf = new JTextField(20);

        add(msg);
        add(cb);
        add(cb2);
        add(tf);

        addWindowListener(this);
        cb.addItemListener(this);
        cb2.addItemListener(this);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                msg.setText(String.format("Mouse clicked at "+ e.getX() + " , "+e.getY()));
            }
        });
        setVisible(true);
    }


    public void keyTyped(KeyEvent e) {msg.setText(e.getKeyChar()+" has been typed.");}

    public void keyPressed(KeyEvent e) {msg.setText(e.getKeyChar()+" has been pressed.");}

    public void keyReleased(KeyEvent e) {msg.setText(e.getKeyChar()+" was been released.");}

    public void itemStateChanged(ItemEvent e) {}
    public void windowOpened(WindowEvent e) {}

    public void windowClosing(WindowEvent e) {dispose();}
    public void windowClosed(WindowEvent e) {dispose();}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new Main();
    }
}
