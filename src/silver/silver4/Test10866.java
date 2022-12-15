package silver.silver4;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Test10866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = st.countTokens();
            if (count == 1) {
                String command = st.nextToken();
                switch (command){
                    case "pop_back":
                        if (deque.isEmpty()) {
                            System.out.println(-1);
                        }else {
                            System.out.println(deque.removeLast());
                        }
                        break;
                    case "pop_front":
                        if (deque.isEmpty()) {
                            System.out.println(-1);
                        }else {
                            System.out.println(deque.removeFirst());
                        }
                        break;
                    case "size" :
                        System.out.println(deque.size());
                        break;
                    case "empty" :
                        if (deque.isEmpty()) {
                            System.out.println(1);
                        }else{
                            System.out.println(0);
                        }
                        break;
                    case "back" :
                        if (deque.isEmpty()) {
                            System.out.println(-1);
                        }else{
                            System.out.println(deque.peekLast());
                        }
                        break;
                    case "front" :
                        if (deque.isEmpty()) {
                            System.out.println(-1);
                        }else{
                            System.out.println(deque.peekFirst());
                        }
                        break;
                }
            } else if (count == 2) {
                String command = st.nextToken();
                int p = Integer.parseInt(st.nextToken());
                switch (command){
                    case "push_back":
                        deque.offerLast(p);
                        break;
                    case "push_front":
                        deque.offerFirst(p);
                        break;

                }
            }
        }
        }
    }
