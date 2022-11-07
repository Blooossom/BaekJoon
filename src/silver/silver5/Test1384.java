package silver.silver5;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test1384 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = 1;
        while(true){
            int T = Integer.parseInt(br.readLine());

            if(T==0){
                break;
            }
            String[] name = new String[T];
            ArrayList<Integer> num =new ArrayList<>();
            ArrayList<String> list = new ArrayList<>();
            String[][] check = new String[T][T-1];
            for (int i = 0; i <name.length; i++) {
                st=new StringTokenizer(br.readLine());
                name[i]=st.nextToken();
                for (int j = 0; j <check[i].length; j++) {
                    check[i][j]=st.nextToken();
                }
            }
            System.out.println("Group "+count);
            boolean message = true;
            for (int i = 0; i <check.length; i++) {
                for (int j = 0; j <check[i].length; j++) {
                    if(check[i][j].equals("N")){
                        message = false;
                        for (int k = i-1; k >=0; k--) {
                            list.add(name[k]);
                        }
                        for (int k = name.length-1; k >i; k--) {
                            list.add(name[k]);
                        }
                        System.out.println(list.get(j)+" was nasty about "+name[i]);
                        list.clear();
                    }
                }
            }
            if(message){
                System.out.println("Nobody was nasty");
            }
            count++;
            System.out.println();
        }
    }
}
