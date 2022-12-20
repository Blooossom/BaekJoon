package silver.silver5;

import java.io.*;
import java.util.ArrayList;

public class Test1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            boolean group = true;
            String input = br.readLine();
            ArrayList<Character> list = new ArrayList<>();
            list.add(input.charAt(0));
            for (int j = 1; j < input.length(); j++) {
                if (list.contains(input.charAt(j))) {
                    if (list.get(j - 1) == input.charAt(j)) {
                        list.add(input.charAt(j));
                    } else {
                        group = false;
                        break;
                    }
                } else {
                    list.add(input.charAt(j));
                }
            }
            if (group) {
                count++;
            }
        }
        System.out.println(count);
    }
}
