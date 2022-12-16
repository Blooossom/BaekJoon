package silver.silver4;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test17219 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();
            map.put(key, value);
        }
        for (int i = 0; i < M; i++) {
            System.out.println(map.get(br.readLine()));
        }

    }
}
