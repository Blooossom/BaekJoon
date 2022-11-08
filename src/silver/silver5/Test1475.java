package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1475 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] arr = new int[10];
        for (int i = 0; i <10; i++) {
            arr[i]=i;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        int set = 1;
        for (int i = 0; i <arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i <N.length(); i++) {
            if(list.contains(Character.getNumericValue(N.charAt(i)))){
                list.remove(Integer.valueOf(Character.getNumericValue(N.charAt(i))));
            }else{
                if(Character.getNumericValue(N.charAt(i))==6){
                    if(list.contains(9)){
                        list.remove(Integer.valueOf(9));
                    }else{
                        for (int j = 0; j <arr.length; j++) {
                            list.add(arr[j]);
                        }
                        list.remove(Integer.valueOf(Character.getNumericValue(N.charAt(i))));
                        set++;
                    }
                }else if(Character.getNumericValue(N.charAt(i))==9){
                    if(list.contains(6)){
                        list.remove(Integer.valueOf(6));
                    }else{
                        for (int j = 0; j <arr.length; j++) {
                            list.add(arr[j]);
                        }
                        list.remove(Integer.valueOf(Character.getNumericValue(N.charAt(i))));
                        set++;
                    }
                }else {
                    for (int j = 0; j < arr.length; j++) {
                        list.add(arr[j]);
                    }
                    list.remove(Integer.valueOf(Character.getNumericValue(N.charAt(i))));
                    set++;
                }
            }
        }
        System.out.println(list);
        System.out.println(set);

    }
}
