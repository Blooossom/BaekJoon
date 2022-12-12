package bronze.bronze1;

import java.io.*;
import java.util.Arrays;

public class Test1855 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[str.length()/K][K];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = str.charAt(k);
                    k++;
                }
            }else{
                for (int j = arr[0].length - 1; j >=0; j--) {
                    arr[i][j] = str.charAt(k);
                    k++;
                }
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);

    }
}
