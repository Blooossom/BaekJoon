import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TestPage {
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new long[N + 1];
        if (dp.length == 1) {
            System.out.println(0);
            return;
        }
        System.out.println(Factorial(N));

    }
    static long Factorial(int n) {
        if (n == 1 || n == 0) {
            return dp[n] = 1;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        else {
            return dp[n] = n * Factorial(n - 1);
        }
    }
}