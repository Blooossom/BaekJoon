package AlgorithmSrc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoPointer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        System.out.println(twoPointer(arr,x));
    }
    public static int twoPointer(int[] arr, int m){
        int count = 0;
        int sp = 0;
        int ep = 0;
        int sum = 0;
        while (true) {
            if(sum>=m){
                sum -= arr[sp++];
            } else if (ep>=arr.length) {
                break;
            }else{
                sum += arr[ep++];
            }
            if(sum==m){
                count++;
            }
        }
        return count;
    }
}
