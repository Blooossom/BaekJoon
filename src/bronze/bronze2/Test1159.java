package bronze.bronze2;

import java.io.*;
import java.util.*;

public class Test1159 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            list.add(br.readLine().charAt(0));
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), Collections.frequency(list, list.get(i)));
        }
        Iterator<Map.Entry<Character, Integer>> entries = map.entrySet().iterator();
        boolean temp = false;
        while(entries.hasNext()){
            Map.Entry<Character, Integer> entry = entries.next();
            if (entry.getValue() >= 5) {
                temp = true;
                sb.append(entry.getKey());
            }
        }
        if(temp == false){
            System.out.println("PREDAJA");
        }else {
            System.out.println(sb);
        }
    }
}
