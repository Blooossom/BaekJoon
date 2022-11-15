package silver.silver4;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test1205 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        if(N==0){
            System.out.println(1);
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        st=new StringTokenizer(br.readLine()," ");
        for (int i = 0; i <N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i <list.size(); i++) {
            if(P==list.size()){
                if(T<=list.get(list.size()-1)){
                    System.out.println(-1);
                    break;
                }else{
                    if(T>=list.get(i)){
                        list.add(i,T);
                        System.out.println(list.indexOf(T)+1);
                        break;
                    }
                }
            }else if(list.size()>P){
                if(T<=list.get(P-1)){
                    System.out.println(-1);
                    break;
                }else{
                    if(T>=list.get(i)){
                        list.add(i,T);
                        System.out.println(list.indexOf(T)+1);
                        break;
                    }
                }
            }else{
                if(T<list.get(list.size()-1)){
                    list.add(T);
                    System.out.println(list.indexOf(T)+1);
                    break;
                }
                if(T>=list.get(i)){
                    list.add(i,T);
                    System.out.println(list.indexOf(T)+1);
                    break;
                }
            }
        }

        //랭킹 꽉차있을 때 최저점수랑 동일한 경우

    }
}
