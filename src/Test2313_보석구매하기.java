import java.io.*;
import java.util.StringTokenizer;

public class Test2313_보석구매하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int max = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int sp = 0;
            int ep = 0;
            st = new StringTokenizer(br.readLine());

            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                int p = Integer.parseInt(st.nextToken());
                arr[j] = p;
            }

            int[] prefixSum = new int[N];
            prefixSum[0] = arr[0];

            for (int j = 1; j < prefixSum.length; j++) {
                prefixSum[j] = arr[j] + prefixSum[j - 1];
                if(max < prefixSum[j]){
                    max = prefixSum[j];
                    ep = j;
                }
            }
            for (int j = 1; j < arr.length; j++) {
                if (prefixSum[j] >= arr[j]) {
                    continue;
                } else {
                    int[] temp = new int[arr.length - j];
                    temp[0] = arr[j];
                    if (max < temp[0]) {
                        max = temp[0];
                        sp = j;
                        ep = j;
                    }
                    else if (max == temp[0]) {
                        if (ep - sp > 0) {
                            sp = j;
                            ep = j;
                        }
                    }
                    for (int k = 1; k < temp.length; k++) {
                        temp[k] = temp[k - 1] + arr[k + j];
                        if (max < temp[k]) {
                            max = temp[k];
                            sp = j;
                            ep = k + j;
                        }
                        else if (max == temp[k]) {
                            if (ep - sp > k) {
                                sp = j;
                                ep = k + j;
                            }
                        }
                    }

                }
            }
            sum += max;
            max = 0;
            sb.append('\n').append(sp + 1).append(' ').append(ep + 1);
        }
        sb.insert(0, sum);
        System.out.println(sb);
    }
}
/*
메모리초과
int sum = 0;
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] dp = new int[N + 1][N + 1];
            st = new StringTokenizer(br.readLine());
            int sp = 0;
            int ep = 0;
            for (int j = 1; j < dp[0].length; j++) {
                int p = Integer.parseInt(st.nextToken());
                if(max < p){
                    max = p;
                    sp = ep = j;
                }
                dp[j][0] = dp[0][j] = dp[j][j] =  p;
            }
            for (int j = 2; j < dp.length; j++) {
                for (int k = 1; k < j; k++) {
                    dp[j][k] = dp[j][0] + dp[j - 1][k];
                    if(max < dp[j][k]){
                        max = dp[j][k];
                        sp = j;
                        ep = k;
                    }
                }
            }
            sum += max;
            sb.append('\n').append(ep).append(' ').append(sp);
        }
        sb.insert(0, sum);
        System.out.println(sb);
 */
