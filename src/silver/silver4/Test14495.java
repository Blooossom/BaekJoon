package silver.silver4;

import java.io.*;
import java.util.Arrays;

public class Test14495 {
    static long[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        dp = new long[T + 1];
        System.out.println(LikeFibonacci(T));
    }
    static long LikeFibonacci(int n){
        if(n == 1 || n == 2 || n == 3){
            return dp[n] = 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        else{
            return dp[n] = LikeFibonacci(n - 1) + LikeFibonacci(n - 3);
        }
    }
}
