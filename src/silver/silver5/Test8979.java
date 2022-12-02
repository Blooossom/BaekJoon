package silver.silver5;

import java.io.*;
import java.util.*;

public class Test8979 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Olympic> list = new ArrayList<>();
        for (int i = 0; i <N; i++) {
            st=new StringTokenizer(br.readLine());
            Olympic olympic = new Olympic(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
            list.add(olympic);
        }
        Collections.sort(list, new Comparator<Olympic>() {
            @Override
            public int compare(Olympic o1, Olympic o2) {
                if (o1.gold > o2.gold) {
                    return -1;
                }else if(o1.gold==o2.gold){
                    if (o1.silver > o2.silver) {
                        return -1;
                    } else if (o1.silver == o2.silver) {
                        if (o1.bronze > o2.bronze) {
                            return -1;
                        }else if(o1.bronze==o2.bronze){
                            return 0;
                        }else{
                            return 1;
                        }
                    }else{
                        return 1;
                    }
                }else {
                    return 1;
                }
            }
        });
        for (int i = 1; i <list.size(); i++) {
            list.get(i).setRank(i+1);
            if (list.get(i).equals(list.get(i - 1))) {
                list.get(i).setRank(list.get(i-1).rank);
            }
        }
        for (Olympic olympic : list) {
            if (olympic.num == K) {
                System.out.println(olympic.rank);
            }
        }
    }
    static class Olympic{
        int num;
        int gold;
        int silver;
        int bronze;
        int rank;

        public Olympic(int num, int gold, int silver, int bronze) {
            ++rank;
            this.num = num;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Olympic olympic = (Olympic) o;
            return gold == olympic.gold && silver == olympic.silver && bronze == olympic.bronze;
        }

        @Override
        public int hashCode() {
            return Objects.hash(num, gold, silver, bronze);
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "Olympic{" +
                    "rank = " +rank+
                    " num=" + num +
                    ", gold=" + gold +
                    ", silver=" + silver +
                    ", bronze=" + bronze +
                    '}';
        }
    }
}
