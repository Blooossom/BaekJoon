package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test1817 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(n==0) {System.out.println(0);return;}
        ArrayList<Integer> list = new ArrayList<>();
        int box = 0;
        st=new StringTokenizer(br.readLine());
        for(int i = 0; i <n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int sum =0;
        for (int i = 0; i <list.size(); i++) {
            sum += list.get(i);
            if(sum>m){
                sum = list.get(i);
                box++;
                if(i==list.size()-1){
                    box++;
                }
            }else if(sum==m){
                sum=0;
                box++;
            }else{
                if(i==list.size()-1){
                    box++;
                }
            }
        }
        System.out.println(box);

    }
}
