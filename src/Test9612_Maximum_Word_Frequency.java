import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Test9612_Maximum_Word_Frequency {
    public static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }
        PriorityQueue<Word> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.frequency > o2.frequency) {
                return -1;
            }
            else if (o1.frequency == o2.frequency) {
                return o2.word.compareTo(o1.word);
            }
            else {
                return 1;
            }
        });
        for (String key:map.keySet()) {
            queue.offer(new Word(key, map.get(key)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(queue.peek().word).append(' ').append(queue.peek().frequency);
        System.out.println(sb);

    }
    private static class Word{
        String word;
        int frequency;

        public Word(String word, int frequency) {
            this.word = word;
            this.frequency = frequency;
        }
    }
}
