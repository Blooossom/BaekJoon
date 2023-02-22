import java.io.*;
import java.util.*;

public class Test26265_멘토와_멘티 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            String[] arr = new String[2];
            st = new StringTokenizer(br.readLine());
            arr[0] = st.nextToken();
            arr[1] = st.nextToken();
            list.add(arr);
        }
        list.sort((o1, o2) -> {
            if (o1[0].compareTo(o2[0]) > 0) {
                return 1;
            } else if (o1[0].compareTo(o2[0]) == 0) {
                return o2[1].compareTo(o1[1]);
            } else {
                return -1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String[] param:list) {
            sb.append(param[0]).append(" ").append(param[1]).append('\n');
        }
        System.out.println(sb);
    }
}
