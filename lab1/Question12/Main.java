package lab1.Question12;

import java.util.Scanner;

public class Main{

	public static void main(String[] args){
        Multiply multiply = new Multiply();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number : ");		
		int a = scanner.nextInt();
		System.out.print("Enter the second number : ");
		int b = scanner.nextInt();
		try{
			double div = multiply.divide(12,0);
			System.out.println("The division is : "+div);
		}catch(ArithmeticException ex){
			System.out.println("Cannot divide a number by zero");
		}finally{
			int product = a*b;
			System.out.println("Multiplied Value : "+product);
		}
	}
}
