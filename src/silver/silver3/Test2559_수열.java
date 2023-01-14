package silver.silver3;

import java.io.*;
import java.util.StringTokenizer;

public class Test2559_수열 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i < k) {
                sum += arr[i];
            }
        }
        int max = sum;
        for (int i = 0; i + k < n; i++) {
            sum += arr[i + k] - arr[i];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}
