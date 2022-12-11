package bronze.bronze1;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test12605 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int count = st.countTokens();
            for (int j = 0; j < count; j++) {
                stack.add(st.nextToken());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Case #").append(i+1).append(": ");
            while(!stack.isEmpty()){
                sb.append(stack.pop());
                sb.append(' ');
            }
            System.out.println(sb);
        }
    }
}
