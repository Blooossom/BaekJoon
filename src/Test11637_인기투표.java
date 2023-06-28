import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test11637_인기투표 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int total = 0;
            int candidate = 0;
            int num = -1;
            int minBase = Integer.MAX_VALUE;
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                int vote = Integer.parseInt(br.readLine());
                if (vote < minBase) {
                    minBase = vote;
                }
                list.add(vote);
                total += vote;
            }
            int state = 0;
            //과반수 이하
            for (int j = 0; j < list.size(); j++) {
                if (total / 2 >= list.get(j) && minBase < list.get(j) && candidate <= list.get(j)) {
                    if (candidate < list.get(j)) {
                        candidate = list.get(j);
                        num = j + 1;
                        state = 1;
                    }
                    else {
                        state = 3;
                    }
                }
            }
            //과반수 득표
            for (int j = 0; j < list.size(); j++) {
                if (total / 2 < list.get(j) && candidate < list.get(j)) {
                    candidate = list.get(j);
                    num = j + 1;
                    state = 2;
                }
            }
            if (state == 0 || state == 3) {
                System.out.println("no winner");
            }
            else if (state == 1) {
                System.out.println("minority winner " + num);
            }
            else {
                System.out.println("majority winner " + num);
            }
        }
    }
}
