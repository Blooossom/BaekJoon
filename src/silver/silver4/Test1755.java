package silver.silver4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test1755 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Solution> list = new ArrayList<>();
        for (int i = M; i < N + 1; i++) {
            String str = Integer.toString(i);
            String ans = "";
            for (int j = 0; j < str.length(); j++) {
                ans = ans + " " + path(str.charAt(j));
            }
            Solution solution = new Solution(i, ans);
            list.add(solution);
        }
        Collections.sort(list, new Comparator<Solution>() {
            @Override
            public int compare(Solution o1, Solution o2) {
                return o1.value.compareTo(o2.value);
            }
        });
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).key).append(' ');
            if (count == 10) {
                sb.append('\n');
                count = 0;
            }
            count++;

        }
        System.out.println(sb);
    }
    static String path(char ch) {
        String result = "";
        switch (ch) {
            case '0' :
                    result = "zero";
                    break;
            case '1' :
                    result = "one";
                break;
            case '2' :
                    result = "two";
                break;
            case '3' :
                    result = "three";
                break;
            case '4' :
                    result = "four";
                break;
            case '5' :
                    result = "five";
                break;
            case '6' :
                    result = "six";
                break;
            case '7' :
                    result = "seven";
                break;
            case '8' :
                    result = "eight";
                break;
            case '9' :
                    result = "nine";
                break;
        };
        return result;
    }
    static class Solution{
        int key;
        String value;

        public Solution(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
