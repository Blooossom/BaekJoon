package Unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test3943 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i <T; i++) {
            int input = Integer.parseInt(br.readLine());
            System.out.println(haleStone(input));
        }

    }
    public static int haleStone(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        int i = 0;
        while(true) {
            if (list.get(list.size()-1)==1){
                Collections.sort(list);
                Collections.reverse(list);
                return list.get(0);
            }
            if (list.get(i) % 2 == 0) {
                list.add(n / 2);
            } else {
                list.add((n * 3) + 1);
            }
            i++;
        }
    }
}
