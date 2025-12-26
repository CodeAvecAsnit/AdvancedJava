package JavaBasicsLab1.Question5;
/**
 * @author : Asnit Bakhati
 * Question number 5 (All )
 */
public class StaticShow {
    public static int num;

    static{
        num=0;
    }

    public static void incrementNum(){
        num++;
    }

    public int getNum(){
        return num;
    }

    public static void main(String[] args) {
        StaticShow.incrementNum();
        StaticShow show = new StaticShow();
        int x = show.getNum();
        StaticShow.num++;
        StaticShow.incrementNum();
        int y = StaticShow.num;
        System.out.println(x);
        System.out.println(y);
    }
}
