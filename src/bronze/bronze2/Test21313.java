package bronze.bronze2;

import java.io.*;
public class Test21313 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean b = true;
        StringBuilder sb = new StringBuilder();
        if (T % 2 == 0) {
            for (int i = 0; i <T; i++) {
                if (b) {
                    sb.append(1).append(" ");
                    b=false;
                }else{
                    sb.append(2).append(" ");
                    b=true;
                }
            }
        }else{
            for (int i = 0; i <T-1; i++) {
                if (b) {
                    sb.append(1).append(" ");
                    b=false;
                }else{
                    sb.append(2).append(" ");
                    b=true;
                }
            }
            sb.append(3);
        }
        System.out.println(sb.toString().trim());
    }
}
