package bronze.bronze4;
import java.io.*;
import java.util.Arrays;

public class Test11948 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[4];
        int[] arr1 = new int[2];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i <arr1.length; i++) {
            arr1[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(arr[3]+arr[2]+arr[1]+arr1[1]);
    }
}
