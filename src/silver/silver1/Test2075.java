package silver.silver1;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Test2075 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                priorityQueue.offer(Integer.parseInt(st.nextToken()));
            }
        }
        for (int i = 0; i < N - 1; i++) {
            priorityQueue.poll();
        }
        System.out.println(priorityQueue.poll());
    }
}
