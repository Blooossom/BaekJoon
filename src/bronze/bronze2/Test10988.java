package bronze.bronze2;

import java.io.*;

public class Test10988 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split("");
        boolean check = true;
        for (int i = 0; i <arr.length/2; i++) {
            if (!arr[i].equals(arr[arr.length-1-i])) {
                check = false;
            }
        }
        if(check){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
