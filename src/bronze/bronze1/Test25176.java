package bronze.bronze1;

import java.io.*;
public class Test25176 {
    static int[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        System.out.println(Factorial(N));
    }
    static int Factorial(int p){
        if (p == 0 || p == 1) {
            return 1;
        } else {
            return dp[p] = Factorial(p - 1) * p;
        }
    }
}
