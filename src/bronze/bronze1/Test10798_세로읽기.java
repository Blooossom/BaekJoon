package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Test10798_세로읽기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String[]> list = new ArrayList<>();
        StringTokenizer st;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            String[] arr = input.split("");
            max = Math.max(arr.length, max);
            list.add(arr);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (list.get(j).length < max && i >= list.get(j).length) {
                    continue;
                }
                else {
                    sb.append(list.get(j)[i]);
                }
            }
        }
        System.out.println(sb);

    }
}
