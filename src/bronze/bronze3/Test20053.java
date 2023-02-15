package bronze.bronze3;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Test20053 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            sb.append(arr[0])
                    .append(" ")
                    .append(arr[arr.length - 1]);
            System.out.println(sb);
        }


    }
}
/* runtime 1284ms
for (int i = 0; i < T; i++) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int param = Integer.parseInt(st.nextToken());
                minHeap.offer(param);
                maxHeap.offer(param);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(minHeap.poll())
                    .append(" ")
                    .append(maxHeap.poll());
            System.out.println(sb);
        }
 */