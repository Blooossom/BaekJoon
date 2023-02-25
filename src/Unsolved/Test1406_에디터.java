package Unsolved;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Test1406_에디터 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> list = new LinkedList<>();
        String input = br.readLine();
        int len = input.length();
        String[] arr = input.split("");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < len; i++) {
            list.add(arr[i]);
        }
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int point = list.size();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int count = st.countTokens();
            String command = st.nextToken();
            if (count > 1) {
                String param = st.nextToken();
                list.add(point, param);
                point++;
            }
            else {
                switch (command) {
                    case "L":
                        if (point > 0) {
                            point--;
                        }
                        break;
                    case "D":
                        if (point < list.size()) {
                            point++;
                        }
                        break;
                    case "B":
                        if (point > 0) {
                            list.remove(point - 1);
                            point -= 1;
                        }
                        break;
                }
            }
        }
        String result = "";
        for (String key : list) {
            result = result + key;
        }
        bw.write(result);
        bw.flush();
    }
}
