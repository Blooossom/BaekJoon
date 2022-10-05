package bronze.bronze3;
import java.io.*;
public class Test2444 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb;
        for (int i = 0; i <N-1; i++) {
            sb = new StringBuilder();
            for (int j = N-1; j >i ; j--) {
                sb.append(" ");
            }
            for (int k = 0; k <2*(i+1)-1; k++) {
                sb.append("*");
            }
            sb.append("\n");
            System.out.print(sb);
        }

        for (int i = 0; i <N; i++) {
            sb = new StringBuilder();
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for (int k = 2 * (N - 1) - 1; k > 2 * (i - 1); k--) {
                sb.append("*");
            }
            sb.append("\n");
            System.out.print(sb);
        }
    }
}
