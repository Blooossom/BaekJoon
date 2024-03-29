package silver.silver2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test14465_소가_길을_건너간_이유_5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        for (int i = 0; i < B; i++) {
            arr[Integer.parseInt(br.readLine())] = 1;
        }
        int sum = 0;
        for (int i = 1; i <= K; i++) {
            sum += arr[i];
        }
        int result = sum;
        for (int i = 2; i <= arr.length - K; i++) {
            sum = sum - arr[i - 1] + arr[i + K - 1];
            result = Math.min(sum, result);
        }
        System.out.println(result);
    }
}
