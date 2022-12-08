package silver.silver3;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Test14235 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            if (st.countTokens() == 1 && Integer.parseInt(st.nextToken()) == 0) {
                int num = priorityQueue.isEmpty()?  -1:priorityQueue.poll();
                sb.append(num).append('\n');
            }else{
                int count = Integer.parseInt(st.nextToken());
                for (int j = 0; j < count; j++) {
                    priorityQueue.offer(Integer.parseInt(st.nextToken()));
                }
            }
        }
        System.out.println(sb);
    }
}
