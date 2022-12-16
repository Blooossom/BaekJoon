package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;

public class Test9933 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            list.add(br.readLine());
        }
        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder(list.get(i));
            if(list.contains(sb.reverse().toString())){
                System.out.println(list.get(i).length());
                System.out.println(list.get(i).charAt(list.get(i).length() / 2));
                return;
            }
        }
    }
}
