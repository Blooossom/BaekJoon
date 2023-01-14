package silver.silver3;

import java.io.*;
import java.util.StringTokenizer;

public class Test10025_게으른_백곰 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[1000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int maxIdx = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int ice = Integer.parseInt(st.nextToken());
            int point = Integer.parseInt(st.nextToken());
            maxIdx = Math.max(maxIdx, point);
            arr[point] = ice;
        }
        int window = (2 * k) + 1;
        int sum = 0;
        for (int i = 0; i < window && i <= 1000000; i++) {
            sum += arr[i];
        }
        int max = sum;
        for (int i = 0; i + window < maxIdx; i++) {
            sum += arr[i + window] - arr[i];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}
