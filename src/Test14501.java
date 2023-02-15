import java.io.*;
import java.util.StringTokenizer;

public class Test14501 {
    public static int N, dp[], T[], P[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        T = new int[N + 2];
        P = new int[N + 2];
        dp = new int[N + 2];
        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        Solution();
    }
    public static void Solution() {
        for (int i = N; i > 0; i--) {
            int tmp = i + T[i];
            if (tmp > N + 1) {
                dp[i] = dp[i + 1];
            }
            else {
                dp[i] = Math.max(dp[i + 1], P[i] + dp[tmp]);
            }
        }
        sb.append(dp[1]).append('\n');
    }
}
