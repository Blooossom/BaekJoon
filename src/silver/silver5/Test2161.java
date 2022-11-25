package silver.silver5;

import java.io.*;
import java.util.ArrayList;

public class Test2161 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        solution(N);
    }
    public static void solution(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        while(true){
            if(list.size()==1)break;
            sb.append(list.get(0)).append(" ");
            list.remove(0);
            list.add(list.get(0));
            list.remove(0);
        }
        sb.append(list.get(0));
        System.out.println(sb);
    }
}
