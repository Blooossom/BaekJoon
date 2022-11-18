package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test6550 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            String input = br.readLine();
            if(input==null){
                break;
            }
            st=new StringTokenizer(input);
            String s = st.nextToken();
            String t = st.nextToken();
            ArrayList<String> S = new ArrayList<>();
            for (int i = 0; i <s.length(); i++) {
                S.add(s.substring(i,i+1));
            }
            ArrayList<String> T = new ArrayList<>();
            for (int i = 0; i <t.length(); i++) {
                T.add(t.substring(i,i+1));
            }
            int count = 0;
            int start = 0;
            for (int i = 0; i <S.size(); i++) {
                for (int j = start; j <T.size(); j++) {
                    if(S.get(i).equals(T.get(j))){
                        count++;
                        start=j+1;
                        break;
                    }
                }
            }
            if(S.size()==count){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
/*
https://www.acmicpc.net/problem/6550
 */
