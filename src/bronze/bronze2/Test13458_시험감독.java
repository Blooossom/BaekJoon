package bronze.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class Test13458_시험감독 {
    public static int N, B, C, arr[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        Solution();

        System.out.println(sb);

    }
    public static void Solution() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= B;
        }

        long num = N;

        for (int idx : arr) {
            if (idx <= 0) {
                continue;
            }
            num += idx / C;
            if (idx % C != 0) {
                num++;
            }
        }
        sb.append(num);
    }
}