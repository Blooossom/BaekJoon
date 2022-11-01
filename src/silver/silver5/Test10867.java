package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Test10867 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> list = new HashSet<>();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <T; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> answer = new ArrayList<>();
        answer.addAll(list);
        Collections.sort(answer);
        for (int i = 0; i <answer.size(); i++) {
            sb.append(answer.get(i)+" ");
        }
        System.out.println(sb.toString().trim());
    }
}
