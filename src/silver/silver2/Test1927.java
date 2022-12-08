package silver.silver2;

import java.io.*;
import java.util.PriorityQueue;

public class Test1927 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                int num = minHeap.size() == 0? 0:minHeap.poll();
                sb.append(num).append('\n');
            }else {
                minHeap.add(input);
            }
        }
        System.out.println(sb);
    }
}
