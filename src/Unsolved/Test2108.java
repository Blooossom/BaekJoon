package Unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test2108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(br.readLine());
            list.add(p);
            sum += p;
        }
        Collections.sort(list);
        System.out.println((int)avg(list, sum));
        System.out.println(mid(list));
        System.out.println(mod(list));
        System.out.println(range(list));
    }
    static double avg(ArrayList<Integer> list, int sum){
        double result = 0.0d;
        result = (double)sum / list.size();
        return result;
    }
    static int range(ArrayList<Integer> list){
        return list.get(list.size() - 1) - list.get(0);
    }
    static int mid(ArrayList<Integer> list){
        return list.size() / 2;
    }
    static int mod(ArrayList<Integer> list){
        int result = 0;
        int num = 0;
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = Collections.frequency(list, list.get(i));
        }
        return num;
    }
}
