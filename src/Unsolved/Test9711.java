package Unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Test9711 {
    static long[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T ; i++) {
            StringBuilder sb = new StringBuilder();
            st=new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            dp=new long[p+1];
            if(p>2){
                dp[1]=1;
                dp[2]=1;
                sb.append("Case #"+i+1+": ");
                sb.append(Fibonacci(p,q));
                System.out.println(sb);
            }else if(p==0){
                System.out.println(0);
            }else{
                dp[1]=1;
                System.out.println(dp[1]%q);
            }

        }
    }
    public static long Fibonacci(int a, int b){
        for (int i = 3; i <=a; i++) {
            dp[i]=dp[i-1]%b+dp[i-2]%b;
        }
        return dp[a]%b;
    }
}
