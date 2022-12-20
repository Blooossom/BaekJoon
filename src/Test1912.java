import java.io.*;
import java.util.*;

public class Test1912 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> deque = new ArrayList<>();
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int p = Integer.parseInt(st.nextToken());
            sum += p;
            deque.add(p);
        }
        list.add(sum);
        while (deque.size() >= 2) {
            int F = deque.get(0);
            int L = deque.get(deque.size() - 1);
            if (F < L) {
                deque.remove(0);
                sum -= F;
                list.add(sum);
            } else if(F > L) {
                deque.remove(deque.size() - 1);
                sum -= L;
                list.add(sum);
            } else {
                int i = 0;
                while (true) {
                    int temp1 = deque.get(i);
                    int temp2 = deque.get(deque.size() - 1 - i);
                    if(temp1 != temp2){
                        if (temp1 > temp2) {
                            deque.remove(deque.size() - 1);
                            sum -= L;
                            list.add(sum);
                        } else {
                            deque.remove(0);
                            sum -= F;
                            list.add(sum);
                        }
                        break;
                    }
                    i++;
                }

            }
        }
        System.out.println(Collections.max(list));
    }
}
