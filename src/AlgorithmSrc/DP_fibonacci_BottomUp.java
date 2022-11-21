package AlgorithmSrc;
import java.io.*;
public class DP_fibonacci_BottomUp {
    static long[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp=new long[n+1];
        dp[1]=1;
        dp[2]=1;
        System.out.println(Fibonacci(n));
    }
    private static long Fibonacci(int n){
        for (int i = 3; i <=n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
