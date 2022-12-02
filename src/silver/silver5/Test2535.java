package silver.silver5;

import java.io.*;
import java.util.*;

public class Test2535 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Medal> list = new LinkedList<>();
        for (int i = 0; i <T; i++) {
            st=new StringTokenizer(br.readLine());
            Medal medal = new Medal(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
            list.add(medal);
        }
        Collections.sort(list, new Comparator<Medal>() {
            @Override
            public int compare(Medal o1, Medal o2) {
                if(o1.score<o2.score){
                    return 1;
                } else if (o1.score > o2.score) {
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        int[] check = new int[100];
        int count = 0;
        int i = 0;
        while (true) {
            if(count==3)break;
            if(check[list.get(i).country]==2){
                i++;
            }else{
                sb.append(list.get(i).country).append(" ")
                        .append(list.get(i).student).append("\n");
                check[list.get(i).country]++;
                i++;
                count++;
            }
        }
        System.out.println(sb);
    }
    static class Medal{
        private int country;
        private int student;
        private int score;

        public Medal(int country, int student, int score) {
            this.country = country;
            this.student = student;
            this.score = score;
        }

        public int getCountry() {
            return country;
        }

        public int getStudent() {
            return student;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return "Medal{" +
                    "country=" + country +
                    ", student=" + student +
                    ", score=" + score +
                    '}';
        }
    }
}
