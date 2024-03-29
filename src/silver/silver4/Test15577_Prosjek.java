package silver.silver4;
import java.io.*;
import java.util.PriorityQueue;

public class Test15577_Prosjek {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Double> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            queue.offer(Double.parseDouble(br.readLine()));
        }
        while (true) {
            double p = queue.poll();
            double q = queue.poll();
            double answer = (p + q) / 2;
            if (queue.isEmpty()) {
                bw.write(String.format("%6f", answer));
                break;
            }
            queue.offer(answer);
        }
        bw.flush();
    }
}
