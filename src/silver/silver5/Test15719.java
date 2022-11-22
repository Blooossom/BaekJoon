package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class Test15719 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <N; i++) {
            arr[Integer.parseInt(st.nextToken())]++;}
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==2){
                System.out.println(i);
            }
        }

    }
}
