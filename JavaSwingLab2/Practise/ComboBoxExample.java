package JavaSwingLab2.Practise;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ComboBoxExample{

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        List<String> list= new ArrayList<>();
        list.add("Nepal");
        list.add("India");
        list.add("Nepali");
        list.add("Indian");
        list.add("Chinese");
        list.add("World");
        list.add("Europe");
        list.add("France");
        JComboBox cb = new JComboBox(list.stream().toArray());
        cb.setBounds(50, 50, 200, 30);
        frame.add(cb);


        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}
