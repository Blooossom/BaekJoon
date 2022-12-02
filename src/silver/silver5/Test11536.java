package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test11536 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <T; i++) {
            list.add(br.readLine());
        }
        System.out.println(increasing(list));

        System.out.println(decreasing(list));

        if (list.equals(increasing(list))) {
            System.out.println(list);
            System.out.println("INCREASING");
        } else if (list.equals(decreasing(list))) {
            System.out.println(list);
            System.out.println("DECREASING");
        }else{
            System.out.println("NEITHER");
        }
    }
    static ArrayList<String> increasing(ArrayList<String> input){
        ArrayList<String> answer = new ArrayList<>();
        answer.addAll(input);
        Collections.sort(answer, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return answer;
    }
    static ArrayList<String> decreasing(ArrayList<String> input){
        ArrayList<String> answer = new ArrayList<>();
        answer.addAll(input);
        Collections.sort(answer, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        return answer;
    }

}
