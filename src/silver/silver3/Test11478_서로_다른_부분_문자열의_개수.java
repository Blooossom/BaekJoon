package silver.silver3;

import java.io.*;
import java.util.HashSet;

public class Test11478_서로_다른_부분_문자열의_개수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= input.length(); i++) {
            for (int j = 0; j + i <= input.length(); j++) {
                String temp = input.substring(j, i  + j);
                if (temp.length() < 1)continue;
                set.add(temp);
            }
        }
        bw.write(Integer.toString(set.size()));
        bw.flush();
    }
}
