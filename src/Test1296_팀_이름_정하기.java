import java.io.*;
import java.util.HashMap;

public class Test1296_팀_이름_정하기 {
    public static HashMap<Character, Integer> map;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        map = new HashMap<>();
        map.put('L', 0);
        map.put('O', 0);
        map.put('V', 0);
        map.put('E', 0);
        for (int i = 0; i < name.length(); i++) {
            if (map.containsKey(name.charAt(i))) {
                map.put(name.charAt(i), map.getOrDefault(name.charAt(i), 0) + 1);
            }
        }
        String answer = "";
        int max = 0;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            HashMap<Character, Integer> temp = new HashMap<>();
            temp.put('L', 0);
            temp.put('O', 0);
            temp.put('V', 0);
            temp.put('E', 0);
            for (int j = 0; j < input.length(); j++) {
                if (temp.containsKey(input.charAt(j))) {
                    temp.put(input.charAt(j), temp.getOrDefault(input.charAt(j), 0) + 1);
                }
            }
            if (max < calculate(temp)) {
                max = calculate(temp);
                answer = input;
            }
        }
        System.out.println(answer);
    }
    public static int calculate(HashMap<Character, Integer> temp) {
        int L = map.get('L') + temp.get('L');
        int O = map.get('O') + temp.get('O');
        int V = map.get('V') + temp.get('V');
        int E = map.get('E') + temp.get('E');

        return ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) / 100;
    }
}
