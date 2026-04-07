package JavaLab2Swing.Question23;

import javax.swing.*;

public class ToolbarDialog extends JFrame {

    JToolBar toolBar;
    JButton modalBtn, modelessBtn;

    public ToolbarDialog(){
        toolBar = new JToolBar();
        modalBtn = new JButton("Modal Dialog");
        modelessBtn = new JButton("Modeless Dialog");

        toolBar.add(modalBtn);
        toolBar.add(modelessBtn);

        add(toolBar,"North");
        modalBtn.addActionListener(e -> {
            JDialog dialog = new JDialog(this, "Modal Dialog", true);
            dialog.add(new JLabel("This is a modal dialog", JLabel.CENTER));
            dialog.setSize(250, 150);
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
        });

        modelessBtn.addActionListener(e->{
                JDialog dialog = new JDialog(this,"Modeless Dialog", false);
                dialog.add(new JLabel("This is a modeless dialog", JLabel.CENTER));
                dialog.setSize(250, 150);
                dialog.setLocationRelativeTo(this);
                dialog.setVisible(true);
        });

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ToolbarDialog();
    }
}
