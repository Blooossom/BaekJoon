package silver.silver3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test3273_두_수의_합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int S = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        System.out.println(twoPointer(arr, S));
    }
    static int twoPointer(int[] arr, int m){
        int count = 0;
        int sp = 0;
        int ep = arr.length - 1;
        int sum;
        while (sp < ep) {
            sum = arr[sp] + arr[ep];
            if (sum < m) {
                sp++;
            }
            else if (sum == m) {
                count++;
                sp++;
                ep = arr.length - 1;
            }
            else {
                ep--;
            }
        }
        return count;
    }
}
