package silver.silver5;

import java.io.*;

public class Test14729 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];
        for (int i = 0; i <T; i++) {
            arr[(int)(Double.parseDouble(br.readLine())*1000)]++;
        }
        int count = 0;
        label1:
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]!=0){
                for (int j = 0; j <arr[i]; j++) {
                    System.out.println(String.format("%.3f",i*0.001));
                    count++;
                    if(count==7){
                        break label1;
                    }
                }
            }
        }
    }
}
