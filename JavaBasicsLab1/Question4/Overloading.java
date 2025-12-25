package JavaBasicsLab1.Question4;

/**
 * @author : Asnit Bakhati
 * Question number 4 (all of the questions are here)
 */
public class Overloading {
    int a;
    int b;

    public Overloading(){
        System.out.println("Constructor with no params");
        this.a=9;
        this.b=7;
    }
    public Overloading(int a){
        System.out.println("Constructor with one param");
        this.a=a;
        this.b=5;
    }
    public Overloading(int a,int b){
        System.out.println("Constructor with two params");
        this.a=a;
        this.b = b;
    }

    public int methodOverloading(int a){
        System.out.println("Method taking a");
        this.a =a;
        return a;
    }

    public int methodOverloading(Overloading overloading){
        System.out.println("Method taking Object");
        this.a = overloading.a;
        return this.a;
    }

    public int methodOverloading(int a,int b){
        System.out.println("Method taking two params triggered");
        this.a=a;
        this.b=b;
        return a+b;
    }

    public static void main(String[] args) {
        Overloading ol1 = new Overloading(1);
        Overloading ol2 = new Overloading(6,7);
        System.out.println(ol1.methodOverloading(8));
        System.out.println(ol2.methodOverloading(ol1));
        System.out.println(ol2.methodOverloading(6,9));
    }
}
