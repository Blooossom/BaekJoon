package gold.gold3;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Test2109_순회강연 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        PriorityQueue<Lecture> priorityQueue = new PriorityQueue<>(new Comparator<Lecture>() {
            @Override
            public int compare(Lecture o1, Lecture o2) {
                if (o1.price > o2.price) {
                    return -1;
                } else if (o1.price == o2.price) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        int maxDay = 0;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            Lecture lecture = new Lecture(p, d);
            if (maxDay < lecture.day) {
                maxDay = lecture.day;
            }
            priorityQueue.offer(lecture);
        }
        boolean[] check = new boolean[maxDay + 1];
        int money = 0;
        while (!priorityQueue.isEmpty()) {
            Lecture temp = priorityQueue.poll();
            for (int i = temp.day; i >= 1; i--) {
                if (!check[i]) {
                    check[i] = true;
                    money += temp.price;
                    break;
                }
            }
        }
        System.out.println(money);
    }
    static class Lecture{
        int price;
        int day;

        public Lecture(int price, int day) {
            this.price = price;
            this.day = day;
        }
    }
}
