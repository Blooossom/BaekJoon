package bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class Test9094_수학적_호기심 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        for (int i = 1; i <= input; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int j = 1; j < p; j++) {
                for (int k = j + 1; k < p; k++) {
                    int temp = ((j * j) + (k * k) + q) % (j * k);
                    if (temp == 0) {
                        count++;
                    }
                }
            }
            bw.write(Integer.toString(count));
            bw.write('\n');
        }
        bw.flush();
    }
}
