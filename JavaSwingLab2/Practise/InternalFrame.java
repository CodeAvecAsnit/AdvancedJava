package JavaSwingLab2.Practise;

import javax.swing.*;

public class InternalFrame {
    public static void main(String[] args) {
        JFrame frame =new JFrame("Internal Frame");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(3);

        JDesktopPane pane = new JDesktopPane();

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame");
        internalFrame.setSize(300,200);
        internalFrame.setVisible(true);

        JLabel label = new JLabel("this is the inside of internal frame");
        internalFrame.add(label);
        pane.add(internalFrame);

        frame.add(pane);
        frame.setVisible(true);
    }
}
