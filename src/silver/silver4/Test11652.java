package silver.silver4;

import java.io.*;
import java.util.HashMap;

public class Test11652 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long key = Long.parseLong(br.readLine());
            if(map.containsKey(key)){
                map.put(key, Integer.parseInt(map.get(key).toString()) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int max = 0;
        long frequency = 0;
        for (Long key:map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                frequency = key;
            } else if (max == map.get(key)) {
                frequency = Math.min(frequency, key);
            }
        }
        System.out.println(frequency);
    }
}
