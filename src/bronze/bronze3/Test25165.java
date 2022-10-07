package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test25165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());

        if (N % 2 == 0) {
            if (D == 0) {
                System.out.println("No...");
            } else if (D == 1) {
                if (s1 == N) {
                    System.out.println("YES!");
                } else {
                    System.out.println("No...");
                }
            }
        } else {
            if (D == 1) {
                System.out.println("No...");
            } else if (D == 0) {
                if (s1 == N) {
                    System.out.println("YES!");
                } else {
                    System.out.println("No...");
                }
            }
        }
    }
}
