package bronze.bronze1;

import java.io.*;
import java.util.StringTokenizer;
public class Test11050 {
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        dp=new int[31][31];
        int n = Integer.parseInt(st.nextToken());
        int r= Integer.parseInt(st.nextToken());
        System.out.println(combination(n,r));
    }
    public static int combination(int n, int r){
        if(n==r||r==0)return 1;
        if(dp[n][r]>0)return dp[n][r];
        dp[n][r]=combination(n-1,r-1)+combination(n-1,r);
        return dp[n][r];
    }
}
