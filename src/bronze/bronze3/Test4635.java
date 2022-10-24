package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test4635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            int T = Integer.parseInt(br.readLine());
            int sum = 0;
            if (T == -1) {
                break;
            }
            int[] velocity = new int[T];
            int[] time = new int[T];
            for (int i = 0; i < T; i++) {
                st = new StringTokenizer(br.readLine());
                velocity[i] = Integer.parseInt(st.nextToken());
                time[i] = Integer.parseInt(st.nextToken());
                if (i >= 1) {
                    sum += velocity[i] * (time[i] - time[i - 1]);
                } else if (i == 0) {
                    sum += velocity[i] * time[i];
                }
            } System.out.println(sum+" miles");
        }
    }
}