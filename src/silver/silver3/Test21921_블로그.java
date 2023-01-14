package silver.silver3;

import java.io.*;
import java.util.StringTokenizer;

public class Test21921_블로그 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int count = 1;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i < X) {
                sum += arr[i];
            }
        }
        int max = sum;
        for (int i = 0; i + X < N; i++) {
            sum += arr[i + X] - arr[i];
            if (max < sum) {
                max = sum;
                count = 1;
            }
            else if (max == sum) {
                count++;
            }
        }
        if (max == 0) {
            System.out.println("SAD");
        }
        else {
            System.out.println(max);
            System.out.println(count);
        }
    }
}
