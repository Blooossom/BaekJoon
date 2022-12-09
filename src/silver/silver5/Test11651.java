package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test11651 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Point> list = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            Point point = new Point(p, q);
            list.add(point);
        }
        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.yp > o2.yp) {
                    return 1;
                }else if(o1.yp == o2.yp){
                    if (o1.xp > o2.xp) {
                        return 1;
                    } else {
                        return -1;
                    }
                }else{
                    return -1;
                }
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
    static class Point{
        int xp;
        int yp;

        public Point() {
        }

        public Point(int xp, int yp) {
            this.xp = xp;
            this.yp = yp;
        }

        @Override
        public String toString() {
            return  xp  + "  " + yp;

        }
    }
}
