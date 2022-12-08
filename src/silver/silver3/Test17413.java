package silver.silver3;

import java.io.*;
import java.util.Stack;

public class Test17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        Stack<Character> stack = new Stack<>();
        boolean check = false;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == '<'){
                check = true;
                // < 이전에 스택에 있는 거 다 지우면서 출력함
                if(!stack.isEmpty()) {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
}
                }
                // < 출력
                System.out.print(sentence.charAt(i));
            }else if (sentence.charAt(i) == '>'){
                check = false;

                // > 출력
                System.out.print(sentence.charAt(i));
            }else if (sentence.charAt(i) == ' ' && !check){
                if(!stack.isEmpty()) {
                    while(!stack.isEmpty()){
                        System.out.print(stack.pop());
                    }
                }
                System.out.print(sentence.charAt(i));
            } else {
                if (check){
                    System.out.print(sentence.charAt(i));
                }else{
                    stack.push(sentence.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
/*
if(!stack.isEmpty()) {
                    while(!stack.isEmpty()){
                        System.out.print(stack.pop());
                    }
                }
 */