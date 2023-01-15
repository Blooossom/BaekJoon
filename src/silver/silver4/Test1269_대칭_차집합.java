package silver.silver4;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Test1269_대칭_차집합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());
        HashSet<Integer> aSet = new HashSet<>();
        HashSet<Integer> bSet = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aSize; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bSize; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }
        int count = 0;
        for (int key : aSet) {
            if (!bSet.contains(key)) {
                count++;
            }
        }
        for (int key : bSet) {
            if (!aSet.contains(key)) {
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
    }
}
