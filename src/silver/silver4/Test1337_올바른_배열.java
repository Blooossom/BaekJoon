package silver.silver4;

import java.io.*;
import java.util.ArrayList;

public class Test1337_올바른_배열 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 1; j < 5; j++) {
                if (list.contains(list.get(i) + j)) {
                    count++;
                }
            }
            result = Math.max(result, count);
        }
        System.out.println(4 - result);
    }
}
