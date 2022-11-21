import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10870 {
    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp= new long[n+1];
        System.out.println(Fibonacci(n));
    }
    private static long Fibonacci(int n){
        if (n==0){
            return dp[n]=0;
        }
        if(n==1||n==2){
            return dp[n]=1;
        }
        if(dp[n]!=0){
            return dp[n];
        }else{
            return dp[n]=Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}
