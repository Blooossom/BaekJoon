package bronze.bronze5;
import java.io.*;
import java.util.Arrays;

public class Test5597 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];

        for (int i = 0; i <28; i++) {
            arr[Integer.parseInt(br.readLine())-1]++;
        }
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println(i+1);
            }
        }

        System.out.println();
    }
}
