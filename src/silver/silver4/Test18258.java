package silver.silver4;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Test18258 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    deque.offer(Integer.parseInt(st.nextToken()));
                    break;
                    case "pop":
                        Integer number = deque.poll();
                        if (number == null) {
                            sb.append(-1).append('\n');
                        } else {
                            sb.append(number).append('\n');
                        }
                        break;
                    case "size":
                        sb.append(deque.size()).append('\n');
                        break;
                    case "empty":
                        if (deque.isEmpty()) {
                            sb.append(1).append('\n');
                        } else {
                            sb.append(0).append('\n');
                        }
                        break;
                    case "front":
                        Integer front = deque.peek();
                        if (front == null) {
                            sb.append(-1).append('\n');
                        } else {
                            sb.append(front).append('\n');
                        }
                        break;
                    case "back":
                        Integer back = deque.peekLast();
                        if (back == null) {
                            sb.append(-1).append('\n');
                        } else {
                            sb.append(back).append('\n');
                        }
                        break;
            }
        }
        System.out.println(sb);
    }
}
