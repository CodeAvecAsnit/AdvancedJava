package JavaBasicsLab1.Question11;
import java.util.Scanner;

public class Rectangle implements Shape{
    @Override
    public double area(double len, double bre) {
        return len*bre;
    }

    @Override
    public double perimeter(double len, double bre) {
        return 2*(len+bre);
    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        System.out.print("Enter the length of the Rectangle : ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("Enter the breadth of the Rectangle : ");
        int bre = sc.nextInt();
        System.out.println("The area is "+rectangle.area(len,bre));
        System.out.println("The perimeter is "+rectangle.perimeter(len,bre));

    }
}
