package silver.silver3;

import java.io.*;
public class Test9461 {
    static long[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        dp = new long[101];
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(triangle(N));
        }
    }
    static long triangle(int p){
        if (p == 1 || p == 2 || p == 3) {
            return dp[p] = 1;
        }
        if (dp[p] != 0) {
            return dp[p];
        }
        else {
            return dp[p] = triangle(p - 2) + triangle(p - 3);
        }
    }
}
