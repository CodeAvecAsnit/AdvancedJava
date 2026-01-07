package JavaSwingLab2.Practise;

import javax.swing.*;
import java.awt.*;

public class InputDialogBox extends JFrame {
    JFrame f;
    InputDialogBox(){
    }

    void showInput(){
        JOptionPane.showInputDialog(this,"Enter Name");
    }

    void showWarning(){
        JOptionPane.showMessageDialog(this,"Successfully updated. ","Alert",2);
    }

    public static void main(String[] args) {
        new InputDialogBox().showWarning();
    }
}
