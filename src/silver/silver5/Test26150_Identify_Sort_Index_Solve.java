package silver.silver5;

import java.io.*;
import java.util.*;

public class Test26150_Identify_Sort_Index_Solve {
    public static List<Puzzle> list = new ArrayList<>();
    public static String answer = "";
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            int level = Integer.parseInt(st.nextToken());
            list.add(new Puzzle(name, num, level));
        }
        sort();
        index();
        solve();
        System.out.println(answer);
    }

    public static void sort() {
        list.sort((o1, o2) -> o1.num - o2.num);
    }
    public static void index(){
        for (int i = 0; i < list.size(); i++) {
            int idx = list.get(i).level;
            answer = answer + list.get(i).name.charAt(idx - 1);
        }
    }
    public static void solve(){
        answer = answer.toUpperCase();
    }
    public static class Puzzle{
        String name;
        int num;
        int level;

        public Puzzle(String name, int num, int level) {
            this.name = name;
            this.num = num;
            this.level = level;
        }
    }
}
