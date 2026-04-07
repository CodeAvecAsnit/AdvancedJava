package JavaLab2Swing.Practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerExample implements ItemListener {

    JLabel l;
    JCheckBox cb,cb2;

    ItemListenerExample(){
        JFrame frame = new JFrame("Check box example");
        l = new JLabel();
        l.setAlignmentX(Label.CENTER);
        l.setAlignmentY(Label.CENTER_ALIGNMENT);
        cb = new JCheckBox("C++");
        cb.setBounds(100,100,50,50);
        cb2 = new JCheckBox("Java");
        cb2.setBounds(100,150,50,50);
        frame.add(cb);
        frame.add(cb2);
        frame.add(l);
        cb.addItemListener(this);
        cb.addItemListener(this);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==cb){
            l.setText("C++ checkbox checked");
        }else l.setText("Java Checkbox checked");
    }

    public static void main(String[] args) {
        new ItemListenerExample();
    }
}
