import java.io.*;
import java.util.*;

public class Test20920_영단어_암기는_괴로워 {
    public static HashMap<String, Integer> map;
    public static PriorityQueue<String> queue;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }
        queue = new PriorityQueue<>((o1, o2) -> {
            if (map.get(o1) > map.get(o2)) {
                return -1;
            }
            else if (Objects.equals(map.get(o1), map.get(o2))) {
                if (o1.length() > o2.length()) {
                    return -1;
                }
                else if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return 1;
                }
            }
            else {
                return 1;
            }
        });
        mapToQueue();
        Solution();
        System.out.println(sb);

    }
    public static void mapToQueue() {
        for (String key:map.keySet()) {
            queue.offer(key);
        }
    }
    public static void Solution() {
        while(!queue.isEmpty()) {
            String output = queue.poll();
            if (output.length() >= M) {
                sb.append(output).append('\n');
            }
        }
    }
}
