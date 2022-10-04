package bronze.bronze4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test2440 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = N; i>0; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <i; j++) {
                sb.append("*");

            }sb.append("\n");
            System.out.print(sb);
        }
    }

}
