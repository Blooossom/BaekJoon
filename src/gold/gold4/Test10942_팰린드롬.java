package gold.gold4;

import java.io.*;
import java.util.StringTokenizer;

public class Test10942_팰린드롬 {
    public static boolean[][] dp;
    public static int N, M, sp, ep, arr[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new boolean[N + 1][N + 1];
        arr = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        memoization();
        M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            sp = Integer.parseInt(st.nextToken());
            ep = Integer.parseInt(st.nextToken());
            sb.append(dp[sp][ep]? 1:0)
                    .append('\n');

        }
        System.out.println(sb);
    }
    public static void memoization() {
        for (int i = 1; i <= N; i++) {
            dp[i][i] = true;
        }
        for (int i = 1; i < N; i++) {
            dp[i][i + 1] = arr[i] == arr[i + 1];
        }
        for (int i = 3; i <= N; i++) {
            for (int j = 1; j + i <= N + 1; j++) {
                if(arr[j] == arr[j + i - 1]) {
                    if (dp[j + 1][j + i - 2]) {
                        dp[j][j + i - 1] = true;
                    }
            }
        }
        }
    }
}
