package gold.gold4;

import java.io.*;
import java.util.StringTokenizer;

public class Test1806_부분합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] arr = new int[length];
        int sp = 0;
        int ep = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        int result = 100001;
        while(sp <= length - 1 && ep <= length - 1) {
            if (sum >= target) {
                result = Math.min(result, ep - sp);
            }
            if (sum < target) {
                sum += arr[ep++];
            }
            else {
                sum -= arr[sp++];
            }
        }
        if (result == 100001){
            System.out.println(0);
        }else {
            System.out.println(result);
        }




    }
}
