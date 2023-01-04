package gold.gold5;


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test2225_합분해 {
    static final long div = 1000000000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long[][] dp = new long[K][N + 1];
        for (int i = 0; i < K; i++) {
            dp[i][0] = 1;
        }
        Arrays.fill(dp[0], 1);
        for (int i = 1; i < K; i++) {
            for (int j = 1; j <= N; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                dp[i][j] %= div;
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        System.out.println(dp[K - 1][N]);
    }
}
/*
for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
 */
