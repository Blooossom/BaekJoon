package Unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test15489_파스칼삼각형 {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<long[]> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            long[][] dp = new long[R + W - 1][R + W - 1];
            for (int i = 0; i < dp.length; i++) {
                dp[i][0] = dp[i][i] = 1;
            }
            list.add(dp[0]);
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < i; j++) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                }
                list.add(dp[i]);
            }
            long sum = 0;

            for (int i = 0; i < W; i++) {
                System.out.println(Arrays.toString(list.get(i + R -1)));
                for (int j = C - 1; j < i + 2; j++) {
                    System.out.println(i);
                    System.out.println(j);
                    if (list.get(R + i - 1)[j] == 0) {
                        break;
                    }
                    else {
                        sum += list.get(R + i - 1)[j];
                    }
                }
            }
            System.out.println(sum);
    }
}
