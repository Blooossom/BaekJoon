package bronze.bronze1;

import java.io.*;
import java.util.StringTokenizer;

public class Test4796 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int C = 0;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            int day;
            C++;
            if(L == 0 && P == 0 && V == 0){
                break;
            }
            int a = V / P;
            int b = V % P;
            if (b >= L) {
                b = L;
            }
            day = (L * a) + b;
            System.out.println("Case " + C + ": " + day);
        }
    }
}
