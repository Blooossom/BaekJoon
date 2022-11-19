package bronze.bronze2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Test2587{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            sum+=list.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((sum/5)+(sum%5)).append("\n").append(list.get(2));
        System.out.println(sb);
        br.close();
    }
}