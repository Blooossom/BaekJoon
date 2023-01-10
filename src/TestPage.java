import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TestPage {
    static long[] dp;
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.append(1);
        sb.append(1);
        System.out.println(sb);
        String res = sb.toString();
        System.out.println(sb);
        String rev = sb.reverse().toString();
        System.out.println(sb);
        System.out.println(res);
        System.out.println(rev);




        // 12가 처음 StringBuilder면 temp에는 21이들어가고,
        System.out.println(res.equals(rev));
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