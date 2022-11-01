package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test5800 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            int gap = 0;
            StringBuilder sb = new StringBuilder();
            st= new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken());
            for (int j = 0; j <C; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);
            for (int j = 0; j <list.size()-1; j++) {
                if (gap < list.get(j + 1) - list.get(j)) {
                    gap=list.get(j+1)-list.get(j);
                }
            }
            sb.append("Class ").append(i+1).append("\n")
                    .append("Max ").append(list.get(list.size()-1)).append(", ")
                    .append("Min ").append(list.get(0)).append(", ")
                            .append("Largest gap ").append(gap);
            list.clear();
            System.out.print(sb);
        }
    }
}
