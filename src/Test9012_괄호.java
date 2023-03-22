import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test9012_괄호 {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            String[] arr = input.split("");
            Stack<String> stack = new Stack<>();
            for (String param:arr) {
                stack.add(param);
            }
            int check = 0;
            label1:
            while (!stack.isEmpty()) {
                if (stack.pop().equals(")")) {
                    check++;
                }
                else {
                    check--;
                }
                if (check < 0) {

                    break label1;
                }
            }
            if (check == 0) {
                sb.append("YES").append('\n');
            }
            else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }
}
