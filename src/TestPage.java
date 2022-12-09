import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TestPage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
       int[] arr = new int[n];
       int[] sort = new int[n];
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sort[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sort);

        int rank = 0;
        for (int p:sort) {
            if (!rankMap.containsKey(p)) {
                rankMap.put(p, rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int key : arr) {
            int ranking = rankMap.get(key);
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);
    }
}
