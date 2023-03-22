import java.io.*;
import java.util.HashMap;

public class Test2495_연속구간 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String input = br.readLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < input.length(); j++) {
                char key = input.charAt(j);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            int maxValue = 0;
            int maxKey = 0;
            for (char key:map.keySet()) {
                if (maxValue < map.get(key)) {
                    maxKey = key;
                    maxValue = map.get(key);
                }
                else if (maxValue == map.get(key)) {
                    maxKey = key;
                }
            }
            System.out.println(map);
            sb.append(maxValue == 1? 1:maxKey).append('\n');
        }
        System.out.println(sb);
    }
}
