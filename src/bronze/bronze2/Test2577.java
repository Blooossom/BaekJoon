package bronze.bronze2;
import java.io.*;
import java.util.Arrays;

public class Test2577 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String str= Integer.toString(A*B*C);
        int[] arr = new int[10];
        for (int i = 0; i < str.length(); i++) {
            arr[Character.getNumericValue(str.charAt(i))]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
