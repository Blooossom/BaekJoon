package bronze.bronze1;

import java.io.*;
import java.util.StringTokenizer;

public class Test14429 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int num = n+1;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i <n; i++) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int r = (j-1)%(m+1);
            while(true){
                if(r>=j){
                    break;
                }
                r=r+(1+m);
                count++;
            }
            if(max>count){
                max = count;
                num = i+1;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(num).append(" ").append(max*2);
        System.out.println(sb);
    }
    /*

     */
}
