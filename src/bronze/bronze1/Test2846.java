package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test2846 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int temp = 0;
        list.add(Integer.parseInt(st.nextToken()));
        for (int i = 0; i <T-1; i++) {
            int inp = Integer.parseInt(st.nextToken());
            if(inp>list.get(list.size()-1)){
                list.add(inp);
                if(temp<Collections.max(list)-Collections.min(list)) {
                    temp=Collections.max(list)-Collections.min(list);
                }
            }else{
                list.clear();
                list.add(inp);
                if(temp<Collections.max(list)-Collections.min(list)) {
                    temp=Collections.max(list)-Collections.min(list);
                }
            }

        }
        System.out.println(temp);
    }
}
