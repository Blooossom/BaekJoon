package bronze.bronze3;

import java.io.*;
public class Test4806 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int count = 0;
        while((str=br.readLine())!=null){
            count++;
        }
        System.out.println(count);
    }
}
