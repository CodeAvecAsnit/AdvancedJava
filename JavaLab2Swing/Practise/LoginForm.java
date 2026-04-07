package JavaLab2Swing.Practise;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {

    JLabel nameLabel, passwordLabel;
    JTextField nameField;
    JPasswordField passField;
    JButton btn;

    public LoginForm(String username, String password) {

        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 220);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        nameLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        nameField = new JTextField(15);
        nameField.setText(username);
        nameField.setEditable(false);
        gbc.gridx = 1;
        add(nameField, gbc);

        passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(passwordLabel, gbc);

        passField = new JPasswordField(15);
        passField.setText(password);
        gbc.gridx = 1;
        add(passField, gbc);

        btn = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btn, gbc);

        btn.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION
            );

            if (result == JOptionPane.YES_OPTION) {
                showNewPage();
            }
        });

        setVisible(true);
    }

    private void showNewPage() {
        new NewPage(nameField.getText()).setVisible(true);
        dispose();
    }
}
