package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test9733 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;
        String[] arr = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        double[] arr1 = new double[7];
        double total = 0;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            int count = st.countTokens();
            for (int i = 0; i < count; i++) {
                String token = st.nextToken();
                if (!list.contains(token)) {
                    total++;
                    continue;
                }
                arr1[list.indexOf(token)]++;
                total++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (arr1[i] == 0.0d) {
                sb.append(list.get(i)).append(" ").append((int)arr1[i])
                        .append(" ").append("0.00");
                sb.append('\n');
            }else{
            sb.append(list.get(i)).append(" ").append((int)arr1[i])
                    .append(" ").append(String.format("%.2f",arr1[i]/total));
            sb.append('\n');
            }
        }
        sb.append("Total ").append((int)total).append(" ").append("1.00");
        System.out.println(sb);

    }
}
