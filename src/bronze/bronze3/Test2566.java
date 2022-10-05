package bronze.bronze3;
import java.util.Arrays;
import java.util.Scanner;
public class Test2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                if(arr[i][j]==max){
                    System.out.println((i+1)+" "+(j+1));
                }
            }
        }
    }
}
