package gold.gold4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test2056_작업 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[T + 1];
        StringTokenizer st;
        long result = 0;
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            dp[i] = p;
            for (int j = 0; j < q; j++) {
                int k = Integer.parseInt(st.nextToken());
                dp[i] = Math.max(dp[i], dp[k] + p);
            }
            result = Math.max(result, dp[i]);
        }
        System.out.println(result);
    }
}
