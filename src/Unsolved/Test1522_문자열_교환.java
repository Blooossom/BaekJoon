package Unsolved;

import java.io.*;
import java.util.Arrays;

public class Test1522_문자열_교환 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = 0;
        int[] arr = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                count++;
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        int result = 1001;

        result = Math.min(result, sum);
        for (int i = 1; i < arr.length - count - 1; i++) {
            if (i == arr.length - count - 2) {
                sum += arr[arr.length - 1] + arr[0] - arr[i - 1];
            } else {
                sum += arr[i + count - 1] - arr[i - 1];
                result = Math.min(result, sum);
            }
        }
        System.out.println(result);

    }
}
