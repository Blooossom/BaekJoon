package silver.silver1;

import java.io.*;

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
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        int result = 1001;
        result = Math.min(result, sum);
        for (int i = 1; i < arr.length; i++) {
            if (i + count - 1 >= arr.length) {
                sum -= arr[i - 1];
                sum += arr[i + count - 1 - arr.length];

            }
            else {
                sum -= arr[i - 1];
                sum += arr[i + count - 1];
            }
            result = Math.min(result, sum);
        }
        System.out.println(result);

    }
}
