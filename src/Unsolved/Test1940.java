package Unsolved;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1940 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int p: arr) {
            p = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(twoPointer(arr, M));
    }
    static int twoPointer(int[] arr, int m){
        int count = 0;
        int sp = 0;
        int ep = 1;
        int sum = 0;
        while (true) {
            if (ep >= arr.length) {
                sp++;
                ep = sp + 1;
            }
            sum = arr[sp] + arr[ep];
            if(sum >= m) {
                sp++;
                ep = sp + 1;
            } else {
                ep++;
            }
            if(sum == m) {
                count++;
            }
            if(sp >= arr.length - 1) {
                break;
            }
        }
        return count;
    }
}
