package JavaLab2Swing.Question21;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JFrame implements ActionListener {
    JTextField tf;
    JMenuItem open, exit, about;

    MenuBar(){
        tf = new JTextField();
        tf.setBounds(60,50,170,20);
        add(tf);

        JButton btn = new JButton("Click Me");
        btn.setBounds(100,120,80,30);
        btn.addActionListener(this);
        add(btn);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");

        open = new JMenuItem("Open");
        exit = new JMenuItem("Exit");
        about = new JMenuItem("About");

        file.add(open);
        file.add(exit);
        help.add(about);
        mb.add(file);
        mb.add(help);

        setJMenuBar(mb);

        open.addActionListener(this);
        exit.addActionListener(this);
        about.addActionListener(this);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Click Me")) JOptionPane.showMessageDialog(null, "Welcome to Java AWT Menu");

        if (e.getSource() == open) tf.setText("Open menu clicked");

        if (e.getSource() == about) JOptionPane.showMessageDialog(null, "MenuBar Demo");

        if (e.getSource() == exit) System.exit(0);
    }

    public static void main(String[] args) {
        new MenuBar();
    }
}
