import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TestPage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyStack<Integer> stack = new MyStack<>();
        int[] arr = {1, 3, 5, 4, 0, 0, 7, 0, 0, 6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                stack.pop();
            }
            else {
                stack.push(arr[i]);
            }
        }
        int sum = 0;
        while (!stack.stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
    static class MyStack<T> {
        private ArrayList<T> stack = new ArrayList<T>();

        public void push(T item) {
            stack.add(item);
        }
        public T pop(){
            return stack.isEmpty()? null:stack.remove(stack.size() - 1);
        }
    }
}
