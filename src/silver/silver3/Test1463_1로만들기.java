package silver.silver3;

import java.io.*;
public class Test1463_1로만들기 {
    static int[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        dp = new int[T + 1];
        System.out.println(MakeOne(T));

    }
    static int MakeOne(int n){
        if (n == 1) {
            return dp[n] = 0;
        }
        if (dp[n] == 0) {
            if (n % 6 ==0) {
                dp[n] = Math.min(MakeOne(n - 1), Math.min(MakeOne(n / 3), MakeOne(n / 2))) + 1;
            }
            else if (n % 3 == 0) {
                dp[n] = Math.min(MakeOne(n /3), MakeOne(n - 1)) + 1;
            }
            else if (n % 2 == 0) {
                dp[n] = Math.min(MakeOne(n / 2), MakeOne(n - 1)) + 1;
            }
            else {
                dp[n] = MakeOne(n - 1) + 1;
            }
        }
        return dp[n];
    }
}
