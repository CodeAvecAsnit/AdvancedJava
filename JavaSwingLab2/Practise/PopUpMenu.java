package JavaSwingLab2.Practise;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class PopUpMenu extends JFrame {

    PopUpMenu() {
        setTitle("PopUpMenu");
        setSize(400, 300);

        JLabel label = new JLabel("Right click anywhere", JLabel.CENTER);
        label.setBounds(50, 50, 300, 50);
        add(label);

        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        Map<String,String> map = new HashMap<>();
        for(String x : map.values())

        cut.addActionListener(e -> label.setText("Cut MenuItem clicked"));
        copy.addActionListener(e -> label.setText("Copy MenuItem clicked"));
        paste.addActionListener(e -> label.setText("Paste MenuItem clicked"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PopUpMenu();
    }

}
