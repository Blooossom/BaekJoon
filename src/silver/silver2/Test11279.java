package silver.silver2;
import java.io.*;
import java.util.PriorityQueue;
import java.util.Collections;
public class Test11279 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if (maxHeap.size() == 0) {
                    System.out.println(0);
                }else{
                    System.out.println(maxHeap.poll());
                }
            }else{
                maxHeap.add(input);
            }
        }
    }
}
