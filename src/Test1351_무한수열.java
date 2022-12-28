import java.io.*;
import java.util.StringTokenizer;

public class Test1351_무한수열 {
    static long[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        dp = new long[1000000];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i/P] + dp[i/Q];
        }
        System.out.println(dp[(int)N]);

    }
}
