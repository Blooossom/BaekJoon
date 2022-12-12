package bronze.bronze2;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test1681 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<String> stack = new Stack<>();
        int T = Integer.parseInt(st.nextToken());
        String str = st.nextToken();
            for (int i = 1; stack.size() != T; i++) {
                String temp = Integer.toString(i);
                if (!temp.contains(str)) {
                    stack.add(temp);
                }
            }
            System.out.println(stack.pop());
        }
    }
