package silver.silver4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test10845 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int count = st.countTokens();
            String str;
            if (count == 2) {
                str = st.nextToken();
                int p = Integer.parseInt(st.nextToken());
                push(queue, p);
            } else {
              str = st.nextToken();
              path(str, queue);
            }
        }
    }
    static void path(String str, Queue<Integer> queue){
        switch (str){
            case "pop":
                pop(queue);
                break;
            case "empty":
                empty(queue);
                break;
            case "size":
                size(queue);
                break;
            case "back":
                back(queue);
                break;
            case "front":
                front(queue);
                break;
            default:
                break;
        }
    }
    static void push(Queue<Integer> queue, int p){
        queue.offer(p);
    }
    static void pop(Queue<Integer> queue){
        if (queue.isEmpty()) {
            System.out.println(-1);
        }else{
            System.out.println(queue.poll());
        }
    }
    static void size(Queue<Integer> queue){
        System.out.println(queue.size());
    }
    static void empty(Queue<Integer> queue){
        if (queue.isEmpty()){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
    static void front(Queue<Integer> queue){
        if (queue.isEmpty()) {
            System.out.println(-1);
        }else{
            System.out.println(queue.peek());
        }
    }
    static void back(Queue<Integer> queue){
        if (queue.isEmpty()) {
            System.out.println(-1);
        }else{
            Stack<Integer> stack = new Stack<>();
            stack.addAll(queue);
            System.out.println(stack.pop());
        }
    }
}
