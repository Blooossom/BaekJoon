package silver.silver5;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test18679_Banana {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
        StringTokenizer st;
        for (int i = 0; i < number; i++) {
            st = new StringTokenizer(br.readLine(), " = ");
           map.put(st.nextToken(), st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        for (int i = 0; i < TC; i++) {
            int p = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < p; j++) {
                sb.append(map.get(st.nextToken())).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
