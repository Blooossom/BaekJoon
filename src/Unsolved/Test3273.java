package Unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Test3273 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr =new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        int x= Integer.parseInt(br.readLine());
        int start=0;
        int end = 0;
        int sum = 0;
        int count = 0;
        if(sum==x){
            count++;
        }
        if(sum!=x){
            if(arr[start]+arr[end]>sum){

            }
        }



    }
}
