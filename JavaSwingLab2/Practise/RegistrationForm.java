package JavaSwingLab2.Practise;

import javax.swing.*;

public class RegistrationForm extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField jt1;
    JPasswordField jp1;
    JRadioButton jr1,jr2;
    JCheckBox jc1,jc2,jc3;
    JButton jb1;


    public void setComponent(){
        l1 = new JLabel("Name:");
        l2 = new JLabel("Password:");
        l3 = new JLabel("Gender:");
        l4 = new JLabel("Hobbies:");
        l5 = new JLabel(" ");

        jt1 = new JTextField();
        jp1 = new JPasswordField();

        jr1 = new JRadioButton("Male");
        jr2 = new JRadioButton("Female");

        jc1 = new JCheckBox("Sports");
        jc2 = new JCheckBox("Music");
        jc3 = new JCheckBox("Reading");

        jb1 = new JButton("Submit");

        ButtonGroup bg = new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);

        l1.setBounds(50, 30, 100, 25);
        jt1.setBounds(160, 30, 150, 25);

        l2.setBounds(50, 70, 100, 25);
        jp1.setBounds(160, 70, 150, 25);

        l3.setBounds(50, 110, 100, 25);
        jr1.setBounds(160, 110, 70, 25);
        jr2.setBounds(240, 110, 80, 25);

        l4.setBounds(50, 150, 100, 25);
        jc1.setBounds(160, 150, 80, 25);
        jc2.setBounds(240, 150, 80, 25);
        jc3.setBounds(320, 150, 100, 25);

        jb1.setBounds(160, 200, 100, 30);
    }

    public void addComponent() {
        this.setLayout(null);

        this.add(l1);
        this.add(jt1);

        this.add(l2);
        this.add(jp1);

        this.add(l3);
        this.add(jr1);
        this.add(jr2);

        this.add(l4);
        this.add(jc1);
        this.add(jc2);
        this.add(jc3);

        this.add(jb1);
    }

    public static void main(String[] args) {
        RegistrationForm form = new RegistrationForm();
        form.setSize(500,300);
        form.setTitle("Registration Form");
        form.setComponent();
        form.addComponent();
        form.setDefaultCloseOperation(3);
        form.setVisible(true);
    }
}
