package silver.silver1;

import java.io.*;
import java.util.StringTokenizer;

public class Test25916_싫은데요 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(twoPointer(arr, M));
    }
    static int twoPointer(int[] arr, int target) {
        int sp, ep, max, sum;
        sp = ep = max = sum = 0;
        while (ep < arr.length) {
            if (sum + arr[ep] <= target) {
                sum += arr[ep];
                max = Math.max(max, sum);
                ep++;
            }
            else {
                sum -= arr[sp++];
            }
            if (sp > ep) {
                sum += arr[ep++];
            }
        }
        return max;
    }
}
