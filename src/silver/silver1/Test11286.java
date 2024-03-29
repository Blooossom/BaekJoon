package silver.silver1;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test11286 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> absHeap = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1) > Math.abs(o2)) {
                return Math.abs(o1) - Math.abs(o2);
            }else if(Math.abs(o1) == Math.abs(o2)){
                return o1-o2;
            }else{
                return -1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                int num = absHeap.size() == 0? 0:absHeap.poll();
                bw.write(String.valueOf(num));
                bw.write("\n");
            }else{
                absHeap.add(input);
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
