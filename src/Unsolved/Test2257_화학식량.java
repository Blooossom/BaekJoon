package Unsolved;

import java.io.*;
import java.util.Stack;

public class Test2257_화학식량 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        int chemical = 0;
        int multiple = 1;
        System.out.println(stack);
        int atomic = 0;
        while (!stack.isEmpty()) {
            char token = stack.pop();
            System.out.println(token);
            if (token == 'H' || token == 'C' || token == 'O'){
                atomic = classifyAtomic(token);
            }
            else if (token == ')') {
                int saveAtomic = 0;
                while (true) {
                    char temp = stack.pop();
                    if(temp == '(') {
                        break;
                    }
                    saveAtomic += classifyAtomic(temp);
                }
                atomic = saveAtomic;
            }
            else {
                multiple = Character.getNumericValue(token);
                char ch = stack.pop();
                if (ch == 'H' || ch == 'C' || ch == 'O'){
                    atomic = classifyAtomic(ch);
                }
                else if (ch == ')') {
                    int saveAtomic = 0;
                    while (true) {
                        char temp = stack.pop();
                        if(temp == '(') {
                            break;
                        }
                        saveAtomic += classifyAtomic(temp);
                    }
                    atomic = saveAtomic;
                }
            }
            chemical += multiple * atomic;
        }
        System.out.println(chemical);
    }
    static int classifyAtomic(char ch){
        int res = 0;
        if (ch == 'H') {
            res = 1;
        }
        else if (ch == 'O') {
            res = 16;
        }
        else if (ch == 'C') {
            res = 12;
        }
        return res;
    }
}
