package Unsolved;

import java.io.*;
import java.util.ArrayList;

public class Test2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if(N<0){
                break;
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(i + 1);
            }
            while (true) {
                list.remove(0);
                if (list.size() == 1) {
                    break;
                }
                list.add(list.get(0));
                list.remove(0);
            }
            System.out.println(list.get(0));
        }
    }
}
