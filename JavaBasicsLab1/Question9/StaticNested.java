package JavaBasicsLab1.Question9;


/**
 * @author : Asnit Bakhati
 */
public class StaticNested {
    public static int data;

    static class Node{
        public void incrementDisplay(){
            System.out.println(data++);
        }
    }
}
