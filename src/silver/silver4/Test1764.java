package silver.silver4;

import java.io.*;
import java.util.*;

public class Test1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < p; i++) {
            map.put(br.readLine(), 0);
        }
        for (int i = 0; i < q; i++) {
            String str = br.readLine();
            if (map.containsKey(str)) {
                map.put(str, 1);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (String key :
                map.keySet()) {
            if (map.get(key) > 0) {
                list.add(key);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
