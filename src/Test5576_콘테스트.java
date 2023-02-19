import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Test5576_콘테스트 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> wCollege = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> kCollege = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < 10; i++) {
            wCollege.offer(Integer.parseInt(br.readLine()));
        }
        for (int i = 0; i < 10; i++) {
            kCollege.offer(Integer.parseInt(br.readLine()));
        }
        int wScore = 0;
        int kScore = 0;
        for (int i = 0; i < 3; i++) {
            wScore += wCollege.poll();
            kScore += kCollege.poll();
        }
        System.out.println(wScore + " " + kScore);

    }
}
