package JavaLab3JDBC.Question37.swingUI;


import JavaLab3JDBC.Question37.controller.AuthController;
import JavaLab3JDBC.Question37.data.ResponseBody;
import JavaLab3JDBC.Question37.data.User;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {

    JLabel nameLabel, passwordLabel, errorLabel;
    JTextField nameField;
    JPasswordField passField;
    JButton btn;
    AuthController controller;

    public LoginForm(AuthController controller) {
        this.controller = controller;

        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        nameLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(nameLabel, gbc);

        nameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        add(nameField, gbc);

        passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        add(passwordLabel, gbc);

        passField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        add(passField, gbc);

        errorLabel = new JLabel("");
        errorLabel.setForeground(Color.RED);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(errorLabel, gbc);

        btn = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        add(btn, gbc);

        btn.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION
            );

            if (result == JOptionPane.YES_OPTION) {
                attemptLogin();
            }
        });

        setVisible(true);
    }

    private void attemptLogin() {
        errorLabel.setText("");

        String username = nameField.getText().trim();
        String password = new String(passField.getPassword());

        // Validation
        if (username.isEmpty()) {
            errorLabel.setText("Username cannot be empty");
            return;
        }

        if (password.isEmpty()) {
            errorLabel.setText("Password cannot be empty");
            return;
        }
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);

        ResponseBody response = controller.loginUser(user);

        if (response.getStatusCode() == 200) {
            showNewPage();
        } else {
            passField.setText("");
            errorLabel.setText(response.getMessage());
        }
    }

    private void showNewPage() {
        new NewPage(nameField.getText()).setVisible(true);
        dispose();
    }
}