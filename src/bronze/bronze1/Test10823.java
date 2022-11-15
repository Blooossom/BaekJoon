package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test10823 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String str = br.readLine();
            if(str==null){
                break;
            }
            list.add(str);
        }
        String answer = "";
        for (int i = 0; i <list.size(); i++) {
            answer = answer+list.get(i);
        }
        StringTokenizer st = new StringTokenizer(answer,",");
        int N = st.countTokens();
        int sum = 0;
        for (int i = 0; i <N; i++) {
            sum+= Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}
