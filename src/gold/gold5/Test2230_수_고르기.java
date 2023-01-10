package gold.gold5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test2230_수_고르기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int result = 2000000001;
        int sp = 0;
        int ep = 0;
        while (ep < length) {
            int subtract = arr[ep] - arr[sp];
            if (subtract < target) {
                ep++;
            }
            else if (subtract == target) {
                result = target;
                break;
            }
            else {
                result = Math.min(result, subtract);
                sp++;
            }
        }
        System.out.println(result);


    }
}
