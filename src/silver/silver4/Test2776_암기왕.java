package silver.silver4;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test2776_암기왕 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            HashMap<Integer, Boolean> map = new HashMap<>();
            int num = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num; j++) {
                map.put(Integer.parseInt(st.nextToken()), true);
            }
            int check = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < check; j++) {
                int key = Integer.parseInt(st.nextToken());
                if (map.containsKey(key)) {
                    sb.append(1);
                }
                else {
                    sb.append(0);
                }
                if (j == check - 1) {
                    continue;
                }
                else {
                    sb.append('\n');
                }
            }
            System.out.print(sb);
        }
    }
}
