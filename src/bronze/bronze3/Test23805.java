package bronze.bronze3;
import java.io.*;
import java.util.Arrays;

public class Test23805 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str1 = "@".repeat(3*N);
        String str2 = " ".repeat(N);
        String str3 = "@".repeat(N);

        String[] arr1 = {str1, str2, str3};
        String[] arr2 = {str3, str2, str1};
        String[] arr3 = {str3, str2, str3, str2, str3};

        for (int j=0; j<N; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(arr1[i]);
            }
            System.out.println();
        }
        for (int i = 0; i <3; i++) {


        for (int m = 0; m <N; m++) {
            for (int j = 0; j <arr3.length; j++) {
                System.out.print(arr3[j]);
            }System.out.println();
        }
        }
        for (int j=0; j<N; j++) {
            for (int i = 0; i <arr2.length; i++) {
                System.out.print(arr2[i]);
            }
            System.out.println();
        }

        }
}
