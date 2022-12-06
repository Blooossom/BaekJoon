package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test12034 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("Case #").append(i+1).append(": ");
            int a = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = st.countTokens();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < count; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            while (true) {
                int j = 0;
                int temp = list.get(j)/3*4;
                if (list.contains(temp)) {
                    sb.append(list.get(j)).append(" ");
                    list.remove(j);
                    list.remove((Integer) temp);
                }else{
                    j++;
                }
                if (list.size() == 0) {
                    break;
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}
