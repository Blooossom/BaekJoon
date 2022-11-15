package bronze.bronze1;

import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;

public class Test1551 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine(),",");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i <K; i++) {
            changeList(list);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <list.size(); i++) {
            sb.append(list.get(i));
            if(i!=list.size()-1){
                sb.append(",");
            }
        }
        System.out.println(sb);

    }
    public static ArrayList<Integer> changeList(ArrayList<Integer> list){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i <list.size()-1; i++) {
            answer.add(list.get(i+1)-list.get(i));
        }
        list.clear();
        list.addAll(answer);
        return list;
    }
}
