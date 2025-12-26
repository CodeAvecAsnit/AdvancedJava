package JavaBasicsLab1.Question3;

import java.util.Scanner;

/**
 * @author : Asnit Bakhati
 * Question No : 3 Jagged Array
 */
public class JaggedArray {
    public static void main(String[] args) {
        int jArr[][] = new int[3][];
        jArr[0] = new int[4];
        jArr[1]= new int[2];
        jArr[2]= new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < jArr.length;++i){
            for(int j = 0 ; j < jArr[i].length;++j){
                System.out.printf("Enter the a[%d][%d] the item : ",i+1,j+1);
                jArr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("The elements of the array are : ");
        for(int i = 0 ; i < jArr.length;++i){
            System.out.print("[");
            for(int j = 0; j<jArr[i].length;++j){
                System.out.print(jArr[i][j]+" ");
            }
            System.out.println("]");
        }
    }
}
