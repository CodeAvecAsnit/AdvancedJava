package JavaBasicsLab1.Question13;

import java.security.SecureRandom;


/**
 * @author : Asnit Bakhati
 */

public class SecondTeacher extends Thread{

    @Override
    public void run() {
        SecureRandom sr = new SecureRandom();
        while (true) {
            System.out.println(sr.nextInt(100)+"R");
            try {
                Thread.sleep(1000);
            } catch (Exception exception) {
            }
        }
    }
}
