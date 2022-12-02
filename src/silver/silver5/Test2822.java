package silver.silver5;

import java.io.*;
import java.util.*;

public class Test2822 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Solution> list = new LinkedList<>();
        for (int i = 1; i <=8; i++) {
            Solution solution = new Solution(i, Integer.parseInt(br.readLine()));
            list.add(solution);
        }
        Collections.sort(list, new Comparator<Solution>() {
            @Override
            public int compare(Solution o1, Solution o2) {
                if (o1.score < o2.score) {
                    return 1;
                } else if (o1.score == o2.score) {
                    return 0;
                }else{
                    return -1;
                }
            }
        });
        int sum = 0;
        for (int i = 0; i <5; i++) {
            sum += list.get(i).score;
        }
        for (int i = 7; i >=5; i--) {
            list.remove(i);
        }
        Collections.sort(list, new Comparator<Solution>() {
            @Override
            public int compare(Solution o1, Solution o2) {
                if (o1.num < o2.num) {
                    return -1;
                } else if (o1.num == o2.num) {
                    return 0;
                }else{
                    return 1;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(sum).append("\n");
        for (int i = 0; i <list.size(); i++) {
            sb.append(list.get(i).num).append(" ");

        }
        System.out.println(sb.toString().trim());

    }
    static class Solution{
        private int num;
        private int score;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public Solution(int num, int score) {
            this.num = num;
            this.score = score;
        }

        @Override
        public String toString() {
            return "num=" + num +
                    ", score=" + score+"/";
        }
    }
}
