package JavaSwingLab2.Question18;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
   TextField t1,t2;
    JButton a,s,m;
    JLabel ans;

    int sum(int a,int b){return a+b;}
    int sub(int a,int b){return a-b;}
    int mul(int a,int b){return a*b;}
    int parseA(){return Integer.parseInt(t1.getText());}
    int parseB(){return Integer.parseInt(t2.getText());}
    void setAns(int val){ans.setText(String.valueOf(val));}

    Main(){
      t1=new TextField();
      t2= new TextField();

      ans = new JLabel("");
      a = new JButton("Add");

      a.addActionListener(e->{
          setAns(sum(parseA(),parseB()));
      });

      s = new JButton("Subtract");
      s.addActionListener(e->{
          setAns(sub(parseA(),parseB()));
      });


      m= new JButton("Multiply");
      m.addActionListener(e->{
          setAns(mul(parseA(),parseB()));
      });

      setLayout(new GridLayout(5, 2, 10, 10));
      add(t1);
      add(t2);
      add(a);
      add(s);
      add(m);
      add(ans);
      setDefaultCloseOperation(3);
      setLocationRelativeTo(null);
      setSize(350,250);
      setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
