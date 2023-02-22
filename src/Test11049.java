import java.io.*;
import java.util.StringTokenizer;

public class Test11049 {
    public static int N, dp[][], arr[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            arr[i + 1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Solution());

    }
    public static int Solution() {
        dp = new int[N + 1][N + 1];
        for (int i = 1; i < N; i++) {
            for (int j = 1; j + i <= N; j++) {
                dp[j][i + j] = Integer.MAX_VALUE;
                for (int k = j; k < i + j; k++) {
                    dp[i][j] = Math.min(dp[j][i + j], dp[j][k] + dp[k + 1][i + j] + arr[j - 1] * arr[k] * arr[i + j]);
                }
            }
        }
        return dp[1][N];
    }
}
