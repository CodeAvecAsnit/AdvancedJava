package JavaSwingLab2.Practise;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SlideExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Slider Example");

        JSlider slider = new JSlider(0,100,50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        JLabel label = new JLabel("Value : 50");
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText("Value "+ slider.getValue());
            }
        });
        frame.add(slider,"North");
        frame.add(label,"South");
        frame.setDefaultCloseOperation(3);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
