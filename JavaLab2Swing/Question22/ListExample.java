package JavaLab2Swing.Question22;

import javax.swing.*;


public class ListExample extends JFrame {

    public ListExample(){
        String[] itemList = new String[]{"Java","C#","PHP"};
        JList<String> jlist = new JList<>(itemList);
        JLabel l = new JLabel();
        jlist.addListSelectionListener(e-> l.setText(jlist.getSelectedValue()));
        add(l,"North");
        add(jlist,"Center");
        setDefaultCloseOperation(3);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListExample();
    }
}

