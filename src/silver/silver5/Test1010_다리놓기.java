package silver.silver5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1010_다리놓기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[][] dp = new long[29][29];
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = i + 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            System.out.println(dp[q - 1][p - 1]);
        }
    }
}
