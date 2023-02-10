import java.io.*;
import java.util.*;

public class Test7662_이중_우선순위_큐 {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                String command = st.nextToken();
                int param = Integer.parseInt(st.nextToken());
                if (command.equals("I")) {
                    map.put(param, map.getOrDefault(param, 0) + 1);
                    maxHeap.offer(param);
                    minHeap.offer(param);
                }
                else {
                    if (map.size() == 0) {
                        continue;
                    }
                    PriorityQueue<Integer> queue = param == 1? maxHeap:minHeap;
                    delete(queue, map);
                }
            }
            if (map.size() == 0) {
                System.out.println("EMPTY");
            }
            else {
                int val = delete(maxHeap, map);
                System.out.println(val + " " + (map.size() > 0? delete(minHeap, map) : val));
            }
        }
    }
    static int delete(PriorityQueue<Integer> queue, HashMap<Integer, Integer> map) {
        int num;
        while(true) {
            num = queue.poll();
            int count = map.getOrDefault(num, 0);

            if (count == 0) {
                continue;
            }
            if (count == 1) {
                map.remove(num);
            }
            else {
                map.put(num, count - 1);
            }
            break;

        }
        return num;
    }
}
