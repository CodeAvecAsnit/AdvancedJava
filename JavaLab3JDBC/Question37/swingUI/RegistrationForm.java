package JavaLab3JDBC.Question37.swingUI;

import JavaLab3JDBC.Question37.DatabaseOperator;
import JavaLab3JDBC.Question37.controller.AuthController;
import JavaLab3JDBC.Question37.data.ResponseBody;
import JavaLab3JDBC.Question37.data.User;
import JavaLab3JDBC.Question37.service.AuthService;
import JavaLab3JDBC.Question37.service.impl.AuthServiceImpl;
import JavaLab3JDBC.connector.JDBCConnector;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class RegistrationForm extends JFrame {
    AuthController controller;
    JLabel l1,l2,l3,l4,l5,errorLabel;
    JTextField jt1;
    JPasswordField jp1;
    JRadioButton jr1,jr2;
    JCheckBox jc1,jc2,jc3;
    JButton jb1,LoginPage;

    public void setComponent() throws SQLException, ClassNotFoundException {
        l1 = new JLabel("Name:");
        l2 = new JLabel("Password:");
        l3 = new JLabel("Gender:");
        l4 = new JLabel("Hobbies:");
        l5 = new JLabel(" ");
        errorLabel = new JLabel();
        errorLabel.setForeground(Color.RED);

        JDBCConnector connector = new JDBCConnector();
        DatabaseOperator operator = new DatabaseOperator(connector);
        AuthService authService = new AuthServiceImpl(operator);
        controller = new AuthController(authService);

        jt1 = new JTextField(20);
        jp1 = new JPasswordField(20);

        jr1 = new JRadioButton("Male");
        jr2 = new JRadioButton("Female");

        jc1 = new JCheckBox("Sports");
        jc2 = new JCheckBox("Music");
        jc3 = new JCheckBox("Reading");

        jb1 = new JButton("Submit");
        jb1.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(this,"Are you sure you want to move on","Confirm",JOptionPane.YES_NO_OPTION);
            if (result==JOptionPane.YES_OPTION) moveOn();
        });

        LoginPage = new JButton();
        LoginPage.addActionListener(e -> {
            this.dispose();
            new LoginForm(controller);
        });

        ButtonGroup bg = new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(l1, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add(jt1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        add(l2, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add(jp1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        add(l3, gbc);

        gbc.gridx = 1;
        add(jr1, gbc);

        gbc.gridx = 2;
        add(jr2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(l4, gbc);

        gbc.gridx = 1;
        add(jc1, gbc);

        gbc.gridx = 2;
        add(jc2, gbc);

        gbc.gridx = 3;
        add(jc3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(jb1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        add(errorLabel, gbc);

    }

    public void moveOn(){
        errorLabel.setText("");

        String username = jt1.getText();
        String password = new String(jp1.getPassword());

        if(username.length() < 8) {
            errorLabel.setText("Username must be at least 8 characters long");
            return;
        }
        if(!username.matches("[a-zA-Z0-9_]+")) {
            errorLabel.setText("Username can only contain letters, numbers and underscore");
            return;
        }
        if(password.length() < 8) {
            errorLabel.setText("Password must be at least 8 characters long");
            return;
        }

        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        ResponseBody body = controller.registerUser(user);

        if(body.getStatusCode()==200) {
            this.dispose();
            new LoginForm(controller).setVisible(true);
        }else{
            jp1.setText("");
            errorLabel.setText(body.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        RegistrationForm form = new RegistrationForm();
        form.setSize(500,300);
        form.setTitle("Registration Form");
        form.setComponent();
        form.setDefaultCloseOperation(3);
        form.setVisible(true);
    }
}