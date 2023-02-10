package Unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test2012_등수_매기기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N, arr[];

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.abs(arr[i] - (i + 1));
        }
        System.out.println(sum);
    }
}
