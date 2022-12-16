package silver.silver2;

import java.io.*;
import java.util.*;

public class Test2910 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> map = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (map.containsKey(input)) {
                map.put(input, Integer.parseInt(map.get(input).toString()) + 1);
            } else {
                map.put(input, 1);
            }
        }
        List<Frequency> list = new LinkedList<>();
        for (Integer key : map.keySet()) {
            Frequency frequency = new Frequency(key, map.get(key));
            list.add(frequency);
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list, new Comparator<Frequency>() {
            @Override
            public int compare(Frequency o1, Frequency o2) {
                if(o1.frequency > o2.frequency) {
                    return -1;
                } else if(o1.frequency.equals(o2.frequency)) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        while (true) {
            Frequency frequency = list.get(0);
            list.remove(0);
            sb.append((Integer.toString(frequency.number)+" ").repeat(frequency.frequency));
            if (list.isEmpty()) {
                break;
            }
        }
        System.out.println(sb);

    }
    static class Frequency{
        int number;
        Integer frequency;

        public Frequency(int number, Integer frequency) {
            this.number = number;
            this.frequency = frequency;
        }

        @Override
        public String toString() {
            return "number=" + number +
                    ", frequency=" + frequency +
                    '}';
        }
    }
}
