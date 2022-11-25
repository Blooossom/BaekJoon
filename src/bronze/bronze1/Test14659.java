package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test14659 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int count = 0;
        for (int i = 0; i <list.size(); i++) {
            int temp = 0;
            label1:
            for (int j = i+1; j <list.size(); j++) {
                if(list.get(i)>list.get(j)){
                    temp++;
                }else{
                   break label1;
                }
            }
            if(count<temp){
                count = temp;
            }
        }
        System.out.println(count);
    }
}
