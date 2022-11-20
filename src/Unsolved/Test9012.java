package Unsolved;

import java.io.*;
import java.util.ArrayList;

public class Test9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i <K ; i++) {
            String input = br.readLine();
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j <input.length(); j++) {
                list.add(input.substring(j,j+1));
            }
            System.out.println(list);
            int length = list.size();
            for (int j = 0; j <list.size(); j++) {
                if(list.get(j).equals("(")){
                    for (int k = j+1; k <list.size(); k++) {
                        if(list.get(k).equals(")")){
                            list.remove(j);
                            list.remove(k);
                            j=-1;
                            break;
                        }
                    }
                }
                System.out.println(list);
                if(list.size()==1){
                    System.out.println("No");
                    break;
                }else if(list.size()==0){
                    System.out.println("Yes");
                    break;
                }
                System.out.println(list.size());
            }
        }
    }
}
