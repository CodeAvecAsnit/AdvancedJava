package JavaLab2Swing.Question26;

import javax.swing.*;
import java.awt.*;

public class DialogsExample extends JFrame {
    JButton Id, qD, eD, wD, cD, iD, oD;

    public DialogsExample(){
        Id = new JButton("InformationDialog");
        Id.addActionListener(e->
                JOptionPane.showMessageDialog(this,"Welcome to swing application"));

        qD = new JButton("Question Dialog");
        qD.addActionListener(e->{
            JOptionPane.showConfirmDialog(this,"Hello how are you","Status",JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE);
        });

        eD = new JButton("Error Dialog");
        eD.addActionListener(e->
                JOptionPane.showMessageDialog(this,"Error Occurred","Error",JOptionPane.ERROR_MESSAGE));

        wD = new JButton("Warning Dialog");
        wD.addActionListener(e->
                JOptionPane.showMessageDialog(this,"This application is about to close", "Warning",JOptionPane.WARNING_MESSAGE));

        cD = new JButton("Confirm Dialog");
        cD.addActionListener(e-> JOptionPane.showConfirmDialog(this,"Are you sure"));

        iD = new JButton("Input Dialog");
        iD.addActionListener(e-> JOptionPane.showInputDialog("Enter the name : "));

        oD = new JButton("Option Dialog");
        oD.addActionListener(e-> JOptionPane.showMessageDialog(this,"amazing output","Output",JOptionPane.PLAIN_MESSAGE));

        add(Id);
        add(qD);
        add(eD);
        add(wD);
        add(cD);
        add(iD);
        add(oD);

        setLayout(new GridLayout());
        setDefaultCloseOperation(3);
        setSize(400,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DialogsExample();
    }
}
