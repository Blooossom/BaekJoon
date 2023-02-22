package bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class Test9094_수학적_호기심 {
    public static int input, p, q, count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 1; i <= input; i++) {
            st = new StringTokenizer(br.readLine());
            p = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());
            count = 0;
            for (int j = 1; j < p; j++) {
                for (int k = j + 1; k < p; k++) {
                    int temp = ((j * j) + (k * k) + q) % (j * k);
                    if (temp == 0) {
                        count++;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(count);
        }
    }
}
