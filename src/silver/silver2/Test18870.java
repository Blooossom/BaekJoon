package silver.silver2;

import java.io.*;
import java.util.*;

public class Test18870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        int[] sort = new int[T];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < T; i++) {
            arr[i] = sort[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sort);
        int idx = 0;
        for (int i = 0; i < sort.length; i++) {
            if(!map.containsKey(sort[i])){
                map.put(sort[i], idx);
                idx++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(arr[i])).append(' ');
        }
        System.out.println(sb);
    }
}
