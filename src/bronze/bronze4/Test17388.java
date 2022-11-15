package bronze.bronze4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test17388 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int sum = A+B+C;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        if(sum>=100){
            System.out.println("OK");
        }else{
            if(A== Collections.min(list)){
                System.out.println("Soongsil");
            }else if(B==Collections.min(list)){
                System.out.println("Korea");
            }else{
                System.out.println("Hanyang");
            }
        }
    }
}
