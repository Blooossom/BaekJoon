package silver.silver2;

import java.io.*;
import java.util.Arrays;

public class Test1699_제곱수의합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] dp = new int[100001];
        dp[1] = 1;
        for (int i = 2; i <= T; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        System.out.println(dp[T]);
    }
}
