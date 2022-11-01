package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test11931 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
