package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test9093 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            ArrayList<String> list = new ArrayList<>();
            st=new StringTokenizer(br.readLine());
            int count = st.countTokens();
            for (int j = 0; j <count; j++) {
                StringBuilder sb = new StringBuilder(st.nextToken());
                list.add(sb.reverse().toString());
            }
            StringBuilder s = new StringBuilder();
            for (int j = 0; j <list.size(); j++) {
                s.append(list.get(j)).append(" ");
            }
            System.out.println(s.toString().trim());
        }
    }
}
