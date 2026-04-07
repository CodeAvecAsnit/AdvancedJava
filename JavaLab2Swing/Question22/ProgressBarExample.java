package JavaLab2Swing.Question22;

import javax.swing.*;

public class ProgressBarExample extends JFrame {
    JProgressBar pb;

    public ProgressBarExample(){

        this.pb = new JProgressBar();
        pb = new JProgressBar(0, 100);
        pb.setBounds(40, 40, 200, 30);
        pb.setStringPainted(true);
        add(pb);
        setSize(300,500);
        setDefaultCloseOperation(3);
        setVisible(true);
        fillJProgressBar();
    }

    void fillJProgressBar(){
        int i = 0;
        while (i <= 100) {
            pb.setValue(i);
            i += 5;
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {new ProgressBarExample();}
}
