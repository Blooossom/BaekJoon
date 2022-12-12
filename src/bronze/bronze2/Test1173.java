package bronze.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class Test1173 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int p = m;
        int ptime = 0;
        int time = 0;
        if (m + T > M) {
            System.out.println(-1);
            return;
        }
        while (ptime != N) {
            if(p + T <= M){
                p += T;
                ptime++;
                time++;
            } else if (p + T > M && p - R >= m) {
                p -= R;
                time++;
            } else if (p + T > M && p - R < m) {
                p = m;
                time++;
            }
        }
        System.out.println(time);
    }
}
