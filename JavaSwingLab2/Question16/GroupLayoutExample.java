package JavaSwingLab2.Question16;

import javax.swing.*;
class GroupLayoutDemo extends JFrame {
    GroupLayoutDemo() {
        setTitle("GroupLayout Demo");

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(b1)
                                .addComponent(b2))
                        .addComponent(b3)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(b1)
                        .addComponent(b2)
                        .addComponent(b3)
        );

        setSize(300, 200);
        setLocation(750, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GroupLayoutDemo();
    }

}
