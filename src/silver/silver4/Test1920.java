package silver.silver4;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashMap<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            map.put(Integer.parseInt(st.nextToken()), 0);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(st.nextToken());
            if (map.containsKey(p)) {
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
