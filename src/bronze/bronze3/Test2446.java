package bronze.bronze3;

import java.io.*;
public class Test2446 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i <N-1; i++) {
            for (int k = 0; k<i ; k++) {
                bw.write(" ");
            }
            for (int j = 2*(N-1)-1; j>2*(i-1); j--) {
                bw.write("*");
            }

            bw.write("\n");
        }
        for (int i = 0; i <N; i++) {
            for (int j = N-1; j >i; j--) {
                bw.write(" ");
            }
            for (int k = 0; k <2*(i+1)-1; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
