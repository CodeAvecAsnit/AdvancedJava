package JavaBasicsLab1.Question12;


/**
 * @author : Asnit Bakhati
 */

public class NestedExceptions {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        Multiply m = new Multiply();
        try{
            try{
                for(int x : arr){
                    System.out.println(m.divide(7.0,x));
                }
            }catch (ArithmeticException aEx){
                System.out.println("Cannot divide by 0");
            }catch (Exception ex){
                System.out.println("Unknown Exception occurred");
            }
            finally {
                int num = arr[arr.length];
                int prod = num*9;
            }

        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Cannot access array out of bounds");
        }
    }
}
