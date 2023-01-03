package silver.silver5;

import java.io.*;
        import java.util.ArrayList;
        import java.util.StringTokenizer;

public class Test16395_파스칼의삼각형 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<long[]>list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long[][] dp = new long[N][N];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = dp[i][i] = 1;
        }
        list.add(dp[0]);
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
            }
            list.add(dp[i]);
        }
        System.out.println(list.get(N - 1)[K - 1]);
    }
}
