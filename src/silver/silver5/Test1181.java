package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        HashSet<String> arr2 = new HashSet<>();
        for (int i = 0; i <T; i++) {
            arr2.add(br.readLine());
        }
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        list.addAll(arr2);
        for (int i = 1; i <51; i++) {
            for (int j = 0; j <list.size(); j++) {
                if(list.get(j).length()==i){
                    list2.add(list.get(j));
                }
            }
            Collections.sort(list2);
            list3.addAll(list2);
            list2.clear();
        }
        for (int i = 0; i <list3.size(); i++) {
            System.out.println(list3.get(i));
        }
    }
}
