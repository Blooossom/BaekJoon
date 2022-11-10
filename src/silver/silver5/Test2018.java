package silver.silver5;

import java.io.*;
public class Test2018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <=T; i++) {
            int tmp=0;
            for (int j = i; j <=T; j++) {
                tmp+=j;
                if(tmp>T){
                    break;
                } else if (tmp==T) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
