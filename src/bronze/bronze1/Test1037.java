package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test1037 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <T; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        System.out.println(list.get(0)*list.get(list.size()-1));
    }
}
