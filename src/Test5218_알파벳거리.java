import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test5218_알파벳거리 {
    private static char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G','H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static HashMap<Character, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException{
        init();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            StringBuilder sb = new StringBuilder();
            sb.append("Distances: ");
            for (int j = 0; j < A.length(); j++) {
                int aPosition = map.get(A.charAt(j));
                int bPosition = map.get(B.charAt(j));
                if (aPosition <= bPosition) {
                    sb.append(bPosition - aPosition).append(" ");
                }
                else {
                    sb.append(26 - (aPosition - bPosition)).append(" ");
                }
            }
            res.append(sb).append('\n');
        }
        System.out.println(res);
    }
    private static void init() {
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i + 1);
        }
    }
}
