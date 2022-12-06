package bronze.bronze2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test14471 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <M; i++) {
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a >= b) {
                list.add(0);
                continue;
            }else{
                list.add(N - a);
            }
        }
        Collections.sort(list);
        int res = 0;
        for (int i = 0; i < list.size()-1; i++) {
            res += list.get(i);
        }
        System.out.println(res);
    }
}
