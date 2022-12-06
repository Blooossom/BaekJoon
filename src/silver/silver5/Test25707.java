package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test25707 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list,Collections.reverseOrder());
        int length = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            length += list.get(i) - list.get(i + 1);
        }
        length += list.get(0) - list.get(list.size() - 1);
        System.out.println(length);
    }
}
