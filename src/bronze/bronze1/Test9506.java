package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;

public class Test9506 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int input = Integer.parseInt(br.readLine());
            if(input==-1){
                break;
            }
            int sum = 0;
            ArrayList<String> list = new ArrayList<>();
            list.add(Integer.toString(input));
            list.add(" = ");
            for (int i = 1; i <input; i++) {
                if(input%i==0){
                    sum+=i;
                    list.add(Integer.toString(i));
                    list.add(" + ");
                }
            }
            StringBuilder sb = new StringBuilder();
            if(sum==input){
                for (int i = 0; i <list.size()-1; i++) {
                    sb.append(list.get(i));
                }
                System.out.println(sb);
            }else{
                System.out.println(input+" is NOT perfect.");
            }

        }
    }
}
