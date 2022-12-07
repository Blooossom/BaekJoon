package silver.silver3;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test13417 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < C; j++) {
                list.add(st.nextToken().charAt(0));
            }
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(0)) <= 0) {
                    list.add(0, list.get(j));
                    list.remove(j+1);
                } else {
                    continue;
                }
            }
            String res = "";
            for (int j = 0; j < list.size(); j++) {
                res = res + Character.toString(list.get(j));
            }
            System.out.println(res);
        }
    }
}
