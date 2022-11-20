package silver.silver4;

import java.io.*;
import java.util.ArrayList;

public class Test10773 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <K; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input==0){
                list.remove(list.size()-1);
            }else{
                list.add(input);
            }
        }
        int sum = 0;
        for (int i = 0; i <list.size(); i++) {
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}
