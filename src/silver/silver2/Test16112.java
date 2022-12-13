package silver.silver2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test16112 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        long sum = 0;
        Collections.sort(list);
        int p = 1;
        for (int i = 1; i < list.size(); i++) {
            if (p < k) {
                sum += (long) list.get(i) * p;
                p++;
            }else{
                sum += (long) list.get(i) *p;
            }
        }
        System.out.println(sum);
    }
}
