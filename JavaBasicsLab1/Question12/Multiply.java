package JavaBasicsLab1.Question12;


/**
 * @author : Asnit Bakhati
 */

public class Multiply {

    public double divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public double divide(double a,int b) {
        if(b==0) throw new ArithmeticException("Cannot divide number by 0");
        return a/b;
    }
}
