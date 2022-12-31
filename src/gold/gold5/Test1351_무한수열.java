package gold.gold5;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Test1351_무한수열 {
    static Map<Long, Long> map = new HashMap<>();
    static int p;
    static int q;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        System.out.println(InfiniteSequence(N));
    }
    static long InfiniteSequence(long param) {
        if (param == 0) {
            return 1;
        }
        if (map.containsKey(param)) {
            return map.get(param);
        }
        long n = (long)Math.floor(param / p);
        long m = (long)Math.floor(param / q);

        map.put(param, InfiniteSequence(n) + InfiniteSequence(m));
        return map.get(param);
    }
}
