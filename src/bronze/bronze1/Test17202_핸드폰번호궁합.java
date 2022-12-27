package bronze.bronze1;

import java.io.*;

public class Test17202_핸드폰번호궁합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = br.readLine().split("");
        String[] B = br.readLine().split("");
        int[][] dp = new int[15][16];
        for (int i = 0; i < dp[0].length/2; i++) {
            dp[0][(i * 2) + 1] = Integer.parseInt(B[i]);
            dp[0][i * 2] = Integer.parseInt(A[i]);
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length - i; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j + 1];
                dp[i][j] %= 10;
            }
        }
        String answer = Integer.toString(dp[14][0]) + Integer.toString(dp[14][1]);
        System.out.println(answer);
    }
}
