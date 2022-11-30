package bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class Test5101 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            int count = 1;
            boolean check = true;
            while(true){
                if (a == c) {
                    check = true;
                    break;
                }else if(a>c){
                    check = false;
                    break;
                }else{
                    a+=b;
                    count++;
                }
            }
            if(check){
                System.out.println(count);
            }else{
                System.out.println("X");
            }
        }
    }
}
