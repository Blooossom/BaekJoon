package silver.silver4;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Test1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashSet<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(st.nextToken());
            set.add(input);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int param = Integer.parseInt(st.nextToken());
            if (set.contains(param)) {
                sb.append(1);
            }
            else {
                sb.append(0);
            }
            if (i == M - 1) {
                break;
            }
            else {
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}
