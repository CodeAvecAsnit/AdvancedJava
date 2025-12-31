package JavaSwingLab2.Question1;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);

        ImageIcon icon = new ImageIcon("copy.png");
        frame.setIconImage(icon.getImage());

        JLabel label = new JLabel("User Icon",icon,2);
        label.setBounds(20,20,200,40);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(20, 70, 200, 30);
        textField.setBorder(new LineBorder(Color.BLUE, 2));
        textField.setToolTipText("Enter your text here");
        frame.add(textField);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(20, 120, 300, 100);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        frame.add(scrollPane);

        JCheckBox checkBox = new JCheckBox("I agree with terms and conditions");
        checkBox.setBounds(20, 240, 100, 30);
        frame.add(checkBox);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 280, 200, 30);
        frame.add(passwordField);

        JRadioButton radio1 = new JRadioButton("Male");
        radio1.setBounds(20, 320, 100, 30);
        JRadioButton radio2 = new JRadioButton("Female");
        radio2.setBounds(140, 320, 100, 30);

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radio1);
        radioGroup.add(radio2);

        frame.add(radio1);
        frame.add(radio2);

        JButton button = new JButton("Click Me");
        button.setBounds(20, 360, 120, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });
        frame.add(button);

        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(20, 410, 120, 30);
        frame.add(comboBox);

        frame.setVisible(true);
    }
}
