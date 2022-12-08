package silver.silver4;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test10828 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String command;
            if (st.countTokens() == 2) {
                command = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                if (command.equals("push")) {
                    push(stack, num);
                }else{
                    return;
                }
            } else {
              command = st.nextToken();
              classify(command, stack);
            }
        }
        br.close();
    }
    static void classify(String command, Stack<Integer> stack){
        switch (command) {
            case "top":
                top(stack);
                break;
            case "size":
                size(stack);
                break;
            case "empty":
                empty(stack);
                break;
            case "pop":
                pop(stack);
                break;
        }
    }
    static void push(Stack<Integer> stack, int num){
        stack.push(num);
    }
    static void top(Stack<Integer> stack){
        if(stack.isEmpty()){
            System.out.println(-1);
        } else {
            System.out.println(stack.peek());
        }
    }
    static void size(Stack<Integer> stack){
        System.out.println(stack.size());
    }
    static void pop(Stack<Integer> stack){
        if (stack.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    static void empty(Stack<Integer> stack){
        if (stack.isEmpty()) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
