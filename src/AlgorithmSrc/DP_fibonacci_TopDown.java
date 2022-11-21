package AlgorithmSrc;
import java.io.*;
public class DP_fibonacci_TopDown {
    static long[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new long[N+1];
        System.out.println(Fibonacci(N));

    }
    private static long Fibonacci(int n){
        if(n==1||n==2){
            return dp[n]=1;
        }
        if (dp[n]!=0){
            return dp[n];
        }else{
            return dp[n]=Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}
