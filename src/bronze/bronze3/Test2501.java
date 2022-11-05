package bronze.bronze3;
import com.sun.tools.javac.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test2501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=N; i++) {
            if(N%i==0){
                list.add(i);
            }
        }
        if(K>list.size()){
            System.out.println(0);
        }else {
            System.out.println(list.get(K - 1));
        }
    }
}
