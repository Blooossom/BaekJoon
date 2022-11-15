package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test2693 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j <10; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);
            Collections.reverse(list);
            System.out.println(list.get(2));
        }
    }
}
