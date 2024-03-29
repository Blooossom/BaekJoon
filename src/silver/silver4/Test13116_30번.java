package silver.silver4;

import java.io.*;
import java.util.*;

public class Test13116_30번 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int p, q;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            p = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());

            int min = Math.min(p, q);
            if(min == p) {
                while(q - p >= p) {
                    q/=2;
                }
            } else {
                while(p - q >= q) {
                    p/=2;
                }
            }
            while (p != q) {
                if(p > q) {
                    p /= 2;
                    if(p== q) break;
                    q /= 2;
                }
                else {
                    q /=2;
                    if(p == q) break;
                    p/=2;
                }
            }
            bw.write((p * 10) + "\n");
        }
        bw.flush();
        bw.close();
    }
}