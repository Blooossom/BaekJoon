package bronze.bronze2;
import java.io.*;
import java.util.Arrays;

public class Test2747 {
    static long[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new long[N];
        System.out.println(fibonacci(N));

    }
    static long fibonacci(int param){
        if (param == 0 || param == 1) {
            return dp[param] = 1;
        }
        if (dp[param] != 0) {
            return dp[param];
        }
        else {
            return dp[param] = fibonacci(param - 1) + fibonacci(param - 2);
        }
    }
}
