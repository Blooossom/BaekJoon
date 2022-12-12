package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test2309 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(br.readLine()));
            sum += list.get(i);
        }
        int sub = sum - 100;
        Collections.sort(list);
        int sp = 0;
        int ep = 0;
        while (true) {
            if (ep >= list.size()) {
                sp++;
                ep = sp;
            }
            if (list.get(sp) + list.get(ep) < sub) {
                ep++;
            } else if (list.get(sp) + list.get(ep) > sub) {
                sp++;
                ep = sp;
            }else{
                int p = list.get(sp);
                int q = list.get(ep);
                list.remove(list.indexOf(q));
                list.remove(list.indexOf(p));
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i)).append('\n');
                }
                System.out.println(sb);
                break;
            }
        }
    }
}
