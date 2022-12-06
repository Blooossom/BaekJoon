import java.io.*;
import java.util.*;

public class Test25631 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list  = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Set<Integer> set = new HashSet<Integer>(list);
        ArrayList<Integer> res = new ArrayList<>();
        for (int temp : set) {
            res.add(Collections.frequency(list,temp));
        }
        System.out.println(Collections.max(res));
    }
}
