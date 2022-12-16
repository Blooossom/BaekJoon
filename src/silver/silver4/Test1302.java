package silver.silver4;

import java.io.*;
import java.util.HashMap;

public class Test1302 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < T; i++) {
            String key = br.readLine();
            if(map.containsKey(key)){
                map.put(key, Integer.parseInt(map.get(key).toString())+1);
            } else {
                map.put(key, 1);
            }
        }
        int count = 0;
        String max = "";
        for (String K:
             map.keySet()) {
            if(map.get(K) > count){
                max = K;
                count = map.get(K);
            }else if(map.get(K).equals(count)){
                if (max.compareTo(K) > 0) {
                    max = K;
                }
            }
        }
        System.out.println(max);
    }
}
