import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test26042 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Queue<Integer> student = new LinkedList<>();

        int max = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int count = st.countTokens();
            if (count == 1) {
                int a = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                student.add(num);
            }else {
                student.poll();
            }
            if(max < student.size()){
                max = student.size();
                if()
            }
            map.put(student.size(), map.get(student.size())+1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max).append(" ").append(map.get(max));
        System.out.println(sb);
    }
}
