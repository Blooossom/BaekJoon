package silver.silver4;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Test10610 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String[] arr = str.split("");
        boolean check =false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("0")){
                check = true;
            }
        }
        if (!check){
            System.out.println(-1);
            return;
        }else{
            int sum = 0;
            for (int i = 0; i <arr.length; i++) {
                sum+= Integer.parseInt(arr[i]);
            }
            if (sum % 3 == 0) {
                Arrays.sort(arr, Comparator.reverseOrder());
                String res = "";
                for (int i = 0; i < arr.length; i++) {
                    res= res + arr[i];
                }
                System.out.println(res);
            }else{
                System.out.println(-1);
                return;
            }
        }
    }
}
