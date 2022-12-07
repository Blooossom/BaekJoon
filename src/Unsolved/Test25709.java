package Unsolved;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test25709 {
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        System.out.println(Solution(T));
    }
    static int Solution(int a){
        String temp = Integer.toString(a);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < temp.length(); i++) {
            list.add(temp.substring(i,i+1));
        }
        System.out.println(list);
        return path(list);
    }

    static int path(ArrayList<String> list){
        boolean zero = true;
            if(list.size() == 1 && list.get(0).equals("0") || list.isEmpty()){
                return count;
            }
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals("0")) {
                    zero = false;
                    break;
                }
            }
            if (zero) {
                return count;
            }
            System.out.println(checkContain1(list));
            if (checkContain1(list)) {
               remove1(list);
            } else {
                minus1(list);
            }
            return count;
    }
    static boolean checkContain1(ArrayList<String> list){
        boolean check;
        check = list.contains("1");
        return check;
    }
    static void remove1(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("1")){
                list.remove(i);
                count++;
                break;
            }
        }
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i).equals("0")) {
                list.remove(i);
            }else {
                break;
            }
        }
        System.out.println(list);
        path(list);
    }

    static void minus1(ArrayList<String> list){
        count++;
        if (list.size() == 1) {
            list.set(0,Integer.toString(Integer.parseInt(list.get(0))-1));
        }else if(list.get(list.size() - 1).equals("0")) {

            list.set(list.size() - 2, Integer.toString(Integer.parseInt(list.get(list.size() - 2)) - 1));
            list.set(list.size() - 1, "9");
        }else{
                list.set(list.size() - 1, Integer.toString(Integer.parseInt(list.get(list.size() - 1)) - 1));
        }
        System.out.println(list);
        path(list);
    }
}
