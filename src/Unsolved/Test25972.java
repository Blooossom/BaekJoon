package Unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test25972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int temp = 0;
        int domino = 0;
        ArrayList<Domino> dom = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            Domino domino1 = new Domino(a, l);
            dom.add(domino1);
        }
        Collections.sort(dom, new Comparator<Domino>() {
            @Override
            public int compare(Domino o1, Domino o2) {
                if (o1.start > o2.start) {
                    return 1;
                } else if (o1.start == o2.start) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        for (int i = 0; i < dom.size(); i++) {
            if (temp != dom.get(i).start) {
                domino++;
            }
            temp = dom.get(i).start + dom.get(i).len;
        }
        br.close();
        System.out.println(dom.toString());
        System.out.println(domino);
    }

    static class Domino {
        int start;
        int len;

        public Domino() {
        }

        public Domino(int start, int len) {
            this.start = start;
            this.len = len;
        }

        @Override
        public String toString() {
            return "Domino{" +
                    "start=" + start +
                    ", len=" + len +
                    '}';
        }
    }

}
