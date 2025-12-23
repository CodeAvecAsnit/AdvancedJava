package lab1.Question3;

import java.util.Scanner;

/**
 * @author : Asnit Bakhati
 * Question number 3
 */
public class Matrix3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        for(int i = 0 ; i < 3;++i){
            for(int j = 0 ; j < 3 ; ++j){
                System.out.printf("Enter the a[%d][%d] the element : ",(i+1),(j+1));
                mat[i][j]=sc.nextInt();
            }
        }
        int height = mat.length;
        for(int i = 0 ; i < 3; ++i){
            System.out.print("[");
            for(int j = 0 ; j < 3 ; ++j){
                if(i==j||(i==(height-1-j))){
                    System.out.print(mat[i][j]+" ");
                }else System.out.print("  ");
            }
            System.out.println("]");
        }
    }
}
