package JavaSwingLab2.Practise;

import javax.swing.*;

public class MenuExample {

    JMenu menu, subMenu, test;
    JMenuItem i1,i3,i4,i5;

    MenuExample(){
        JFrame frame = new JFrame("ACHS College");
        JMenuBar mb = new JMenuBar();

        menu = new JMenu("Menu");
        test = new JMenu("Hello");
        subMenu = new JMenu("Project");

        i1 = new JMenuItem("DWDM");
        i3 = new JMenuItem("POM");
        i4 = new JMenuItem(" ML");
        i5 = new JMenuItem("Image Processing");

        subMenu.add(i1);
        subMenu.add(i4);
        subMenu.add(i3);
        subMenu.add(i5);

        mb.add(menu);
        mb.add(test);
        mb.add(subMenu);
        test.add(i1);

        mb.add(subMenu);
        frame.setJMenuBar(mb);
        frame.setJMenuBar(mb);

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
