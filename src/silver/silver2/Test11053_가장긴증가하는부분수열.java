package silver.silver2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test11053_가장긴증가하는부분수열 {
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
        for (int i = 0; i < T; i++) {
            LIS(i);
        }
        int max = dp[0];
        for (int i = 1; i < T; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
    static int LIS (int N) {
        if (dp[N] == 0) {

            dp[N] = 1;

            for (int i = N - 1; i >= 0; i--) {
                if (arr[i] < arr[N]) {
                    dp[N] = Math.max(dp[N], LIS(i) + 1);
                }
            }
        }
        return dp[N];
    }
}
