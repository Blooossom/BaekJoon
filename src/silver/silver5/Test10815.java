package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class Test10815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        boolean[] arr = new boolean[200000001];
        st=new StringTokenizer(br.readLine());

        for (int i = 0; i <N; i++) {
            int value = Integer.parseInt(st.nextToken());
            arr[value+10000000]=true;
        }
        int M = Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <M; i++) {
            int input = Integer.parseInt(st.nextToken());
            if(arr[input+10000000]){
                sb.append(1).append(" ");
            }else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
