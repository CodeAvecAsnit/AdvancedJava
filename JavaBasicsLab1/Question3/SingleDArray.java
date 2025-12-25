package JavaBasicsLab1.Question3;

/**
 * @author : Asnit Bakhati
 * Question number 3
 */
public class SingleDArray {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for(int i = 1 ; i <=15;++i){
            arr[i-1] =i;
        }
        System.out.println(arr[2]+arr[arr.length-1]);
        displayArray(arr);
    }
    // for each loop
    static void displayArray(int[] nums){
        for(int num : nums){
            System.out.print(num+" ");
        }

    }
}
