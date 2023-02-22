import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Test15819_너의_핸들은 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken());
        PriorityQueue<String> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            queue.offer(br.readLine());
        }
        for (int i = 0; i < idx - 1; i++) {
            queue.poll();
        }
        System.out.println(queue.peek());
    }
}
