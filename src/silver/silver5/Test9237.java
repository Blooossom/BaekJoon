package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test9237 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <T; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        int day = 2;
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if(answer<list.get(i)+day){
                answer = day+list.get(i);
            }
            day++;
        }
        System.out.println(answer);
    }
}
