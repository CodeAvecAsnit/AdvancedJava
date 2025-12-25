package JavaBasicsLab1.Question13;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Teacher implements Runnable{

    @Override
    public void run() {
        SecureRandom sr = new SecureRandom();
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i < 100; ++i){
            list.add(i);
        }
        while(!list.isEmpty()){
            int randIndex = sr.nextInt(list.size());
            System.out.println(list.get(randIndex));
            list.remove(randIndex);
            try{
                Thread.sleep(1000);
            }catch (Exception ex){}
        }

    }
}
