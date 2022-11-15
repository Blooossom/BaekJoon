package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test1292 {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i<1000; i++) {
            for (int j = 0; j <i; j++) {
                list.add(i);
            }
        }
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        for (int i = A-1; i <B; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
