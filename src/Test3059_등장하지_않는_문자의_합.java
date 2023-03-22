import java.io.*;
import java.util.HashMap;

public class Test3059_등장하지_않는_문자의_합 {
    private static char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G','H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static HashMap<Character, Boolean> check = new HashMap<>();
    private static HashMap<Character, Integer> map = new HashMap<>();
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            init();
            int res = 2015;
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if (!check.get(input.charAt(j))) {
                    res -= map.get(input.charAt(j));
                    check.put(input.charAt(j), true);
                }
            }
            sb.append(res);
            if (i != T - 1) {
                sb.append('\n');
            }

        }
        System.out.print(sb);
    }
    private static void init() {
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i + 65);
            check.put(arr[i], false);
        }

    }
}
