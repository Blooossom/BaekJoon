package silver.silver4;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test1620_나는야_포켓몬마스터 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        HashMap<String, String> pokemon = new HashMap<>();
        HashMap<String, String> number = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String key = br.readLine();
            int value = i + 1;
            pokemon.put(key, Integer.toString(value));
            number.put(Integer.toString(value), key);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < Q; i++) {
            String question = br.readLine();
            if (pokemon.containsKey(question)) {
                bw.write(pokemon.get(question));
                bw.write('\n');
            }
            else {
                bw.write(number.get(question));
                bw.write('\n');
            }
        }
        bw.flush();
        bw.close();
    }
}
