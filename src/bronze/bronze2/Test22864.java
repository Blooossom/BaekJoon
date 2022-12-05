package bronze.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class Test22864 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int tired = 0;
        int res = 0;
        int time=1;
        while(true){
            if (tired + A <= M) {
                res+=B;
                tired+=A;
            } else if (tired == M||tired+A>M) {
                tired-=C;
            }
            if (tired < 0) {
                tired=0;
            }
            time++;
            if (time == 25) {
                break;
            }

        }
        System.out.println(res);
    }
}
/*
System.out.println(time);
            System.out.println(res);
            System.out.println(tired);
 */
