package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Test11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Point> priorityQueue = new PriorityQueue<>(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.xp > o2.xp) {
                    return 1;
                } else if (o1.xp == o2.xp) {
                    if(o1.yp > o2.yp) {
                        return 1;
                    }else{
                        return -1;
                    }
                }else{
                    return -1;
                }
            }
        });
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            Point point = new Point(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
            priorityQueue.offer(point);
        }
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
    static class Point{
        int xp;
        int yp;

        public Point(int xp, int yp) {
            this.xp = xp;
            this.yp = yp;
        }

        @Override
        public String toString() {
            return xp + " " + yp;
        }
    }
}
