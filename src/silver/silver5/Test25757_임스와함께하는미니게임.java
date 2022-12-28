package silver.silver5;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Test25757_임스와함께하는미니게임 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        String str = st.nextToken();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < T; i++) {
            set.add(br.readLine());
        }
        int player;
        if (str.equals("F")) {
            player = 2;
        } else if (str.equals("O")) {
            player = 3;
        } else if (str.equals("Y")) {
            player = 1;
        } else {
            return;
        }
        System.out.println(set.size() / player);
    }
}
