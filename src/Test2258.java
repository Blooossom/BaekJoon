import java.io.*;
import java.util.*;

public class Test2258 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        PriorityQueue<Meat> priorityQueue = new PriorityQueue<>(new Comparator<Meat>() {
            @Override
            public int compare(Meat o1, Meat o2) {
                if (o1.price > o2.price){
                    return -1;
                } else if (o1.price == o2.price) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        int sum = 0;
        int p = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Meat meat = new Meat(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
            sum += meat.weight;
            priorityQueue.offer(meat);
        }
        if(sum < M) {
            System.out.println(-1);
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(sum);
        while(!priorityQueue.isEmpty()){
            list.add(priorityQueue.peek().price);
            Meat temp = priorityQueue.poll();
            sum -= temp.weight;
            if (sum < M) {
                break;
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
    static class Meat {
        int weight;
        int price;

        public Meat(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public String toString() {
            return  "weight=" + weight +
                    ", price=" + price;
        }
    }
}
