package bronze.bronze2;

import java.io.*;
public class Test13235 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if(input.length()==1){
            System.out.println("true");
            return;
        }
        String[] arr = input.split("");
        boolean check = true;
        if(arr.length>1){
        for (int i = 0; i <arr.length/2; i++) {
            if(!arr[i].equals(arr[arr.length-1-i])){
                check=false;
            }
        }
        if (check){
            System.out.print("true");
        } else{
            System.out.print("false");
        }
        }
    }
}
