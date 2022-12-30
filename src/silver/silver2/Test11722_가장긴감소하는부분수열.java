package silver.silver2;

import java.io.*;
import java.util.StringTokenizer;

public class Test11722_가장긴감소하는부분수열 {
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[T];
        dp = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < arr.length; i++) {
            LDS(i);
        }
        int min = dp[0];
        for (int i = 1; i < T; i++) {
            min = Math.max(min, dp[i]);
        }
        System.out.println(min);
    }
    static int LDS (int p) {
        if (dp[p] == 0) {

            dp[p] = 1;

            for (int i = p - 1; i >= 0; i--) {
                if (arr[i] > arr[p]) {
                    dp[p] = Math.max(dp[p], LDS(i) + 1);
                }
            }
        }
        return dp[p];
    }
}
