package bronze.bronze3;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test2455 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] total = new int[4];
        StringTokenizer st;
        for (int i = 0; i <4; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            total[i] += (B-A);
        }
        int[] answer = new int[4];
        answer[0] = total[0];
        for (int i = 1; i <4; i++) {
            answer[i] = answer[i-1]+total[i];
        }
        Arrays.sort(answer);
        System.out.println(answer[answer.length-1]);
    }
}
