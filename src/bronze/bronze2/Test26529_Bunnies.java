package bronze.bronze2;

import java.io.*;
public class Test26529_Bunnies {
    static long[] dp = new long[46];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            System.out.println(Fibonacci(Integer.parseInt(br.readLine())));
        }
    }
    static long Fibonacci(int param) {
        if (param == 0 || param == 1) {
            return dp[param] = 1;
        }
        if (dp[param] != 0) {
            return dp[param];
        }
        else {
            return dp[param] = Fibonacci(param - 1) + Fibonacci(param - 2);
        }
    }
}
