package Unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Test14719_빗물 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[W];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sp = 0;
        int ep = 0;
        int count = 0;
        int water = 0;
        while(true) {
            if (ep >= arr.length - 1) {
                if (arr[sp] > arr[ep]) {
                    water -= (arr[sp] - arr[arr.length - 1]) * count;
                }
                break;
            }
            if (arr[sp] <= arr[ep]) {
                int top = arr[sp];
                if (sp == 0 && arr[sp] == 0) {
                    sp++;
                }
                while(sp != ep) {
                    water += top - arr[sp];
                    sp++;
                }
                sp = ep;
            }
            else {
                int bottom = Integer.MIN_VALUE;
                while(arr[sp] >= arr[ep]) {
                    if (bottom < arr[ep])
                    bottom = Math.max(arr[ep], bottom);
                    ep++;
                    if (ep >= arr.length - 1) {

                        while (true) {

                        }
                    }
                }
            }
            if (arr[sp] > arr[ep]) {
                water += arr[sp] - arr[ep];
                ep++;
                count++;
            }
            else {
                count = 0;
                sp = ep;
                ep++;
            }

        }
        System.out.println(water);

    }
}
