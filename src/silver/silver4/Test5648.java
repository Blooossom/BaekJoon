package silver.silver4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test5648 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = st.countTokens();
        int N = Integer.parseInt(st.nextToken());
        ArrayList<String> list = new ArrayList<>();
        if (count > 1) {
            for (int i = 0; i < count - 1; i++) {
                list.add(st.nextToken());
            }
        }
        while (list.size() != N) {
            st = new StringTokenizer(br.readLine());
            int c = st.countTokens();
            for (int i = 0; i < c; i++) {
                list.add(st.nextToken());
            }
        }
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(i));
            list.set(i, sb.reverse().toString());
        }
        ArrayList<Long> change = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            change.add(Long.parseLong(list.get(i)));
        }
        Collections.sort(change);
        for (int i = 0; i < change.size(); i++) {
            System.out.println(change.get(i));
        }


    }

}
