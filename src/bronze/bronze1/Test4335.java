package bronze.bronze1;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test4335 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        label1:
        while(true){
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<String> list1 = new ArrayList<>();
            while(true){
                int input = Integer.parseInt(br.readLine());
                if(input == 0){
                    break label1;
                }
                list.add(input);
                String str = br.readLine();
                if(str.equals("right on")){
                    list1.add(str);
                    break;
                }
                list1.add(str);
            }
            boolean check = true;
            for (int i = 0; i <list.size()-1; i++) {
                if(list1.get(i).equals("too high")){
                    if(list.get(list.size()-1)>=list.get(i)){
                        check=false;
                    }
                }else if(list1.get(i).equals("too low")){
                    if(list.get(list.size()-1)<=list.get(i)){
                        check=false;
                    }
                }
            }
            if(check){
                System.out.println("Stan may be honest");
            }else{
                System.out.println("Stan is dishonest");
            }
        }
    }
}
