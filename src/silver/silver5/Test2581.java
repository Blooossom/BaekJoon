package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = M; i <=N; i++) {
            int count=0;
            for (int j = 1; j <=i ; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                list.add(i);
            }
        }
        int sum = 0;
        for (int i = 0; i <list.size(); i++) {
            sum+=list.get(i);
        }
        if(sum==0){
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(Collections.min(list));
    }
}
