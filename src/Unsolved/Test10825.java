package Unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test10825 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        ArrayList<Subject> list = new ArrayList<>();
        for (int i = 0; i <T; i++) {
            st=new StringTokenizer(br.readLine());
            Subject subject = new Subject(st.nextToken(),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
            list.add(subject);
        }
        Collections.sort(list, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                if (o1.korean > o2.korean) {
                    return -1;
                }else if(o1.korean==o2.korean){
                    if(o1.eng>o2.eng){
                        return 1;
                    } else if (o1.eng == o2.eng) {
                        if (o1.math > o2.math) {
                            return -1;
                        } else if (o1.math==o2.math) {
                            return o2.name.compareTo(o1.name);
                        }else{
                            return 1;
                        }
                    }else{
                        return -1;
                    }
                }else{
                    return 1;
                }
            }
        });
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <list.size(); i++) {
            sb.append(list.get(i).name).append("\n");
        }
        System.out.println(sb);
    }
    static class Subject{
        String name;
        int korean;
        int math;
        int eng;

        public Subject(String name, int korean, int math, int eng) {
            this.name = name;
            this.korean = korean;
            this.math = math;
            this.eng = eng;
        }
    }
}
/*
Donghyuk
Sangkeun
Sunyoung
nsj
Wonseob
Sanghyun
Sei
Kangsoo
Haebin
Junkyu
Soong
Taewhan
 */
/*
12
Junkyu 50 60 100
Sangkeun 80 60 50
Sunyoung 80 70 100
Soong 50 60 90
Haebin 50 60 100
Kangsoo 60 80 100
Donghyuk 80 60 100
Sei 70 70 70
Wonseob 70 70 90
Sanghyun 70 70 80
nsj 80 80 80
Taewhan 50 60 90
 */