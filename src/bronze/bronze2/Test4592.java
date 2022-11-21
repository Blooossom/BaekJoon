package bronze.bronze2;

import com.sun.source.util.Trees;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Test4592 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            ArrayList<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            if(K==0){
                break;
            }
            for (int i = 0; i <K; i++) {
                int input = Integer.parseInt(st.nextToken());
                if(i==0){
                    list.add(input);
                }else{
                    if(input==list.get(list.size()-1)){
                        continue;
                    }else{
                        list.add(input);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <list.size(); i++) {
                sb.append(list.get(i)).append(" ");
            }
            sb.append("$");
            System.out.println(sb);
        }

    }
}
