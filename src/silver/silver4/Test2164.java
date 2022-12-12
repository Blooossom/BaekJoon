package silver.silver4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Test2164 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Queue<Integer> card = new LinkedList<>();
        for (int i = 1; i <= T; i++) {
            card.offer(i);
        }
        while (true) {
            if (card.size() == 1) {
                System.out.println(card.poll());
                break;
            }
            card.poll();
            card.offer(card.poll());
        }
    }
}
