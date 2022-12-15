package bronze.bronze1;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test15098 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = st.countTokens();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String str = st.nextToken();
            if (map.containsKey(str)) {
                map.put(str, 1);
            }else{
                map.put(str, 0);
            }
        }
        boolean check = true;
        for (String key:map.keySet()) {
            if (map.get(key) > 0) {
                check = false;
            }
        }
        if (check) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
