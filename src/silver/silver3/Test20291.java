package silver.silver3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test20291 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), ".");
            String fileName = st.nextToken();
            String fileType = st.nextToken();
            if (map.containsKey(fileType)) {
                map.put(fileType, Integer.parseInt(map.get(fileType).toString()) + 1);
            } else {
                map.put(fileType, 1);
                list.add(fileType);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(' ').append(map.get(list.get(i))).append('\n');
        }
        System.out.println(sb);
    }
}
