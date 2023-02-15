package Unsolved;

import java.io.*;
import java.util.*;

public class Test1912 {
    static int arr[], max;
    static Integer[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        arr = new int[T];
        dp = new Integer[T];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        max = arr[0];

        recursive(T - 1);
        System.out.println(max);
    }
    static int recursive(int param) {
        if(dp[param] == null) {
            dp[param] = Math.max((recursive(param - 1) + arr[param]), arr[param]);
            max = Math.max(dp[param], max);
        }
        return dp[param];
    }
}
