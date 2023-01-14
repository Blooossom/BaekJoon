package silver.silver4;

import java.io.*;
import java.util.StringTokenizer;

public class Test5591_最大の和 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (i < m) {
                sum += arr[i];
            }
        }
        int max = sum;
        for (int i = 0; i + m < n; i++) {
            sum += arr[i + m] - arr[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
