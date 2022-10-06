package bronze.bronze3;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Test2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] award = new int[N];
        for (int j = 0; j < N; j++) {

            int[] dice=new int[3];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i <3; i++) {
                dice[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(dice);
            System.out.println(Arrays.toString(dice));
            if (dice[0] != dice[1] && dice[1] != dice[2] && dice[0] != dice[2]) {
                award[j] = dice[dice.length - 1] * 100;
            } else if (dice[0] == dice[1] && dice[1] == dice[2]) {
                award[j] = (dice[0] * 1000) + 10000;
            } else {
                award[j] = (dice[1] * 100) + 1000;
            }
        }
        Arrays.sort(award);
        System.out.println(Arrays.toString(award));
        System.out.println(award[award.length-1]);
    }
}