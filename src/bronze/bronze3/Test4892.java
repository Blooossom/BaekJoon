package bronze.bronze3;

import java.io.*;
public class Test4892 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i=1;
        while(true){
        int n0 = Integer.parseInt(br.readLine());
        if(n0==0){
            break;
        }
        int n1 = 3*n0;
        int n2;
        if(n1%2==0){
            n2 = n1/2;
        }else{
            n2 = (n1+1)/2;
        }
        int n3 = 3*n2;
        int n4 = n3/9;
        String result = "";
        if (n1 % 2 == 0) {
            n0=2*n4;
            result="even";
        }else{
            n0=2*(n4+1);
            result="odd";
        }
        System.out.println(i+". "+result+" "+n4);
        i++;
        }
    }
}

