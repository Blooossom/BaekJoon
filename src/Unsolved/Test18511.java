package Unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test18511 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int T = Integer.parseInt(st.nextToken());
        int[] arr = new int[T];
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <T; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        String answer ="0".repeat(N.length());
        StringBuilder sb = new StringBuilder(answer);
        Arrays.sort(arr);
        for (int i = 0; i <N.length(); i++) {
            for (int j = arr.length-1; j >=0 ; j--) {
                sb.replace(i,i+1, Integer.toString(arr[j]));
                if(Integer.parseInt(sb.toString())<= Integer.parseInt(N)){
                    break;
            }
        }
        }
        System.out.println(sb);
    }
}
