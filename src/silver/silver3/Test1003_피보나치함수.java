package silver.silver3;

import java.io.*;
public class Test1003_피보나치함수 {
    static long[] dp0 = new long[41];
    static long[] dp1 = new long[41];
    static int count1 = 0;
    static int count0 = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            count0 = 0;
            count1 = 0;
            int K = Integer.parseInt(br.readLine());
            System.out.println(Fibonacci0(K) + " " + Fibonacci1(K));
        }
    }
    static long Fibonacci0(int p){
        if (p == 0 || p == 1) {
            if (p == 0) {
                return dp0[0] = 1;
            }
            else {
                return dp0[0] = 0;
            }
        }
        if (dp0[p] != 0) {
            return dp0[p];
        }
        else {
            return dp0[p] = Fibonacci0(p - 1) + Fibonacci0(p -2);
        }
    }
    static long Fibonacci1(int p){
        if (p == 0) {
            return dp1[p] = 0;
        }
        if (p == 1 || p == 2) {
            return dp1[p] = 1;
        }
        if (dp1[p] != 0) {
            return dp1[p];
        }
        else {
            return dp1[p] = Fibonacci1(p - 1) + Fibonacci1(p -2);
        }
    }
}
