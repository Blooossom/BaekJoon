package silver.silver4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test16499 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<ArrayList<Character>> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            ArrayList<Character> list = new ArrayList<>();
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                list.add(str.charAt(j));
            }
            Collections.sort(list);
            set.add(list);
        }
        System.out.println(set.size());
    }
}
