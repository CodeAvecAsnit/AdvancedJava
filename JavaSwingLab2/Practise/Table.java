package JavaSwingLab2.Practise;

import javax.swing.*;

public class Table {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setSize(400, 300);

        String[][] data = {
                {"101", "Alice", "Computer Science"},
                {"102", "Bob", "Computer Science"},
                {"103", "Charlie", "Computer Science"},
                {"104", "David", "Computer Science"},
                {"105", "Eva", "Computer Science"},
                {"106", "Frank", "Computer Science"},
                {"107", "Grace", "Computer Science"},
                {"108", "Henry", "Computer Science"},
                {"109", "Ivy", "Computer Science"},
                {"110", "Jack", "Computer Science"},
                {"101", "Alice", "Computer Science"},
                {"102", "Bob", "Computer Science"},
                {"103", "Charlie", "Computer Science"},
                {"104", "David", "Computer Science"},
                {"105", "Eva", "Computer Science"},
                {"106", "Frank", "Computer Science"},
                {"107", "Grace", "Computer Science"},
                {"108", "Henry", "Computer Science"},
                {"109", "Ivy", "Computer Science"},
                {"110", "Jack", "Computer Science"},
                {"101", "Alice", "Computer Science"},
                {"102", "Bob", "Computer Science"},
                {"103", "Charlie", "Computer Science"},
                {"104", "David", "Computer Science"},
                {"105", "Eva", "Computer Science"},
                {"106", "Frank", "Computer Science"},
                {"107", "Grace", "Computer Science"},
                {"108", "Henry", "Computer Science"},
                {"109", "Ivy", "Computer Science"},
                {"110", "Jack", "Computer Science"}
        };

        String[] columnNames = {"ID", "Name", "Department"};

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);


        frame.setVisible(true);

    }
    }
