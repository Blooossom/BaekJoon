package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class Test19829_The_Pleasant_Walk {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st  = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sp = 0;
        int ep = 1;
        int len;
        int max = 1;
        int temp = arr[0];
        while (ep < n) {
            if (temp != arr[ep]) {
                temp = arr[ep];
                ep++;
            }
            else {
                temp = arr[ep];
                sp = ep;
                ep = sp + 1;
            }
            len = ep - sp;
            max = Math.max(max, len);
        }
        System.out.println(max);
    }
}
