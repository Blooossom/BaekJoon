import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test17952_과제는끝나지않아 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Submit> stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            if (p == 0) {
                Submit submit = new Submit(0, 1);
                stack.push(submit);
            }
            else {
                int A = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());
                Submit submit = new Submit(A, time);
                stack.push(submit);
            }
        }
        int res  = 0;
        int during = 0;
        while (!stack.isEmpty()) {
            Submit temp = stack.pop();
            during += temp.time;
            if (during > T) {
                break;
            }
            res += temp.score;
        }
        System.out.println(res);
    }
    static class Submit {
        int score;

        int time;

        public Submit(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }
}
