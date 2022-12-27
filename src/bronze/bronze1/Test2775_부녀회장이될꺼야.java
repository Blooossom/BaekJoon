package bronze.bronze1;

import java.io.*;
import java.util.Arrays;

public class Test2775_부녀회장이될꺼야 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] apart = new int[15][14];
            for (int j = 0; j < apart[0].length; j++) {
                apart[0][j] = j + 1;
            }
            for (int j = 1; j < apart.length; j++) {
                for (int l = 0; l < apart[0].length; l++) {
                    for (int m = 0; m <= l; m++) {
                        apart[j][l] += apart[j - 1][m];
                    }
                }
            }
            for (int j = 0; j < apart.length; j++) {
                System.out.println(Arrays.toString(apart[j]));
            }
            System.out.println(apart[k][n - 1]);
        }
    }
}
