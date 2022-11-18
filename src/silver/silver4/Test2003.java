package silver.silver4;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test2003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        int[] arr = new int[N];
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <arr.length; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        int start = 0;
        int end = 0;
        int sum = 0;
        while(true){
            if(sum>=M)
                sum -= arr[start++];
            else if (end > N - 1)
                break;
            else
                sum+=arr[end++];
                if(sum==M){
                    count++;
                }
        }
        System.out.println(count);
    }
}
