import java.io.*;
import java.util.*;

public class Test5635_생일 {
    public static List<Student> list = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            Student student = new Student(name, day, month, year);
            list.add(student);
        }
        System.out.println(sb);
    }
    public static class Student {
        String name;
        int day;
        int month;
        int year;

        public Student(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
    public static void maxAge() {
        list.sort((o1, o2) -> {
            if (o1.year > o2.year) {
                return 1;
            } else if (o1.year == o2.year) {
                if (o1.month > o2.month) {
                    return 1;
                } else if (o1.month == o2.month) {
                    return o1.day - o2.day;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        });
        sb.append(list.get(0).name).append('\n');
    }

    public static void minAge() {
        list.sort((o1, o2) -> {
            if (o1.year > o2.year) {
                return -1;
            } else if (o1.year == o2.year) {
                if (o1.month > o2.month) {
                    return -1;
                } else if (o1.month == o2.month) {
                    return o2.day - o1.day;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        });
        sb.append(list.get(0).name).append('\n');
    }
}
