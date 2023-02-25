package Unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test22993_서든어택3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Player> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int attack = Integer.parseInt(st.nextToken());
            sum += attack;
            list.add(new Player(i + 1, attack));
        }
        list.sort((o1, o2) -> {
            return Integer.compare(o1.ap, o2.ap);
        });
        int myNum = 0;
        int myAp = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).num == 1) {
                myAp = list.get(i).ap;
                myNum = i;
            }
        }
        if (myNum == list.size() - 1) {
            System.out.println("Yes");
            return;
        }
        else {
            for (int i = list.size() - 1; i >= myNum; i--) {
                sum -= list.get(i).ap;
                if (sum > list.get(i).ap) {
                    continue;
                }
                else {
                    System.out.println("No");
                    break;
                }
            }
        }
    }
    private static class Player {
        int num;
        int ap;

        public Player(int num, int ap) {
            this.num = num;
            this.ap = ap;
        }
    }
}
