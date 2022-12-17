package silver.silver4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test2217 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for (int i = 0; i < N; i++) {
            list.set(i, list.get(i) * (N - i));
        }
        int rope = Collections.max(list);
        System.out.println(rope);
    }
}
