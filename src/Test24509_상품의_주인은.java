import java.io.*;
import java.util.*;

public class Test24509_상품의_주인은 {
    private static List<Student> list;

    private static boolean[] alreadyAward;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        alreadyAward = new boolean[T + 1];
        list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            int science = Integer.parseInt(st.nextToken());
            list.add(new Student(num, kor, eng, math, science));
        }
        for (int i = 0; i < 4; i++) {
            selectSortMethod(i);
        }
        System.out.println(sb);
    }
    private static class Student {
        int num;
        int kor;
        int eng;
        int math;
        int science;

        public Student(int num, int kor, int eng, int math, int science) {
            this.num = num;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.science = science;
        }
    }

    private static void selectSortMethod(int idx) {
        switch (idx) {
            case 0 -> korSort();
            case 1 -> engSort();
            case 2 -> mathSort();
            case 3 -> scienceSort();
        }

    }
    private static void korSort() {
        list.sort((o1, o2) -> {
            if(o1.kor > o2.kor) {
                return -1;
            }
            else if (o1.kor == o2.kor) {
                return o1.num - o2.num;
            }
            else {
                return 1;
            }

        });
        int idx = 0;
        while (true) {
            if (alreadyAward[list.get(idx).num]) {
                idx++;
            }
            else {
                sb.append(list.get(idx).num).append(" ");
                alreadyAward[list.get(idx).num] = true;
                break;
            }
        }
    }
    private static void engSort() {
        list.sort((o1, o2) -> {
            if(o1.eng > o2.eng) {
                return -1;
            }
            else if (o1.eng == o2.eng) {
                return o1.num - o2.num;
            }
            else {
                return 1;
            }

        });
        int idx = 0;
        while (true) {
            if (alreadyAward[list.get(idx).num]) {
                idx++;
            }
            else {
                sb.append(list.get(idx).num).append(" ");
                alreadyAward[list.get(idx).num] = true;
                break;
            }
        }
    }

    private static void mathSort() {
        list.sort((o1, o2) -> {
            if(o1.math > o2.math) {
                return -1;
            }
            else if (o1.math == o2.math) {
                return o1.num - o2.num;
            }
            else {
                return 1;
            }

        });
        int idx = 0;
        while (true) {
            if (alreadyAward[list.get(idx).num]) {
                idx++;
            }
            else {
                sb.append(list.get(idx).num).append(" ");
                alreadyAward[list.get(idx).num] = true;
                break;
            }
        }
    }
    private static void scienceSort() {
        list.sort((o1, o2) -> {
            if(o1.science > o2.science) {
                return -1;
            }
            else if (o1.science == o2.science) {
                return o1.num - o2.num;
            }
            else {
                return 1;
            }

        });
        int idx = 0;
        while (true) {
            if (alreadyAward[list.get(idx).num]) {
                idx++;
            }
            else {
                sb.append(list.get(idx).num).append(" ");
                alreadyAward[list.get(idx).num] = true;
                break;
            }
        }
    }

}
/*
switch (idx) {
            case 0:
                korSort();
                break;
            case 1:
                engSort();
                break;
            case 2:
                mathSort();
                break;
            case 3:
                scienceSort();
                break;
        }
 */
