package silver.silver3;

import java.io.*;
import java.util.*;

public class Test13414_수강신청 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int limit = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < len; i++) {
            String param = br.readLine();
            if (set.contains(param)) {
                set.remove(param);
                set.add(param);
            }
            else {
                set.add(param);
            }
        }
        int count = 0;
        for (String key : set) {
            bw.write(key);
            bw.write('\n');
            count++;
            if (count == limit) break;
        }
        bw.flush();

    }
}
