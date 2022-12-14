package silver.silver4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int[] prefix_sum = new int[N + 1];
        for (int i = 1; i < arr.length + 1; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i - 1];
        }
        int res = 0;
        for (int i = 1; i < prefix_sum.length; i++) {
            res += prefix_sum[i];
        }
        System.out.println(res);
    }
}
