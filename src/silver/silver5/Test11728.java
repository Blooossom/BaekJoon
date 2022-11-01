package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test11728 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        st=new StringTokenizer(br.readLine());

        for (int i = 0; i <N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        st= new StringTokenizer(br.readLine());

        for (int i = 0; i <M ; i++) {

            list2.add(Integer.parseInt(st.nextToken()));
        }
        list.addAll(list2);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)+" ");
        }
        System.out.println(sb.toString().trim());
    }
}
