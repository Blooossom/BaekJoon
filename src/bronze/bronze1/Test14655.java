package bronze.bronze1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test14655 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] maxArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < N; i++) {
            maxArr[i] = Integer.parseInt(st.nextToken());
            if (maxArr[i] > 0) {
                max += maxArr[i];
            } else {
                max += maxArr[i] * -1;
            }
        }
        int[] minArr = new int[N];
        int min = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            minArr[i] = Integer.parseInt(st.nextToken());
            if(minArr[i] < 0) {
                min += minArr[i];
            } else {
                min += minArr[i] * -1;
            }
        }
        System.out.println(max - min);
    }
}

