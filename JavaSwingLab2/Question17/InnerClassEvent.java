package JavaSwingLab2.Question17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassEvent extends JFrame {

    JButton btn;

    public InnerClassEvent(){
        this.btn=new JButton("Click Here");
        btn.addActionListener(new InnerHandler());
        add(btn);
        setDefaultCloseOperation(3);
        setTitle("Inner Class Event Handler");
        setSize(500,400);
        setVisible(true);
    }

    public class InnerHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showInputDialog("Wow you just clicked");
        }
    }

    public static void main(String[] args) {
        new InnerClassEvent();
    }
}
