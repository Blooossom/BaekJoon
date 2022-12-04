package silver.silver4;

import java.io.*;
public class Test13699 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[36];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i <arr.length; i++) {
            for (int j = 0; j <i; j++) {
                arr[i]+=arr[j]*arr[i-j-1];
            }
        }
        System.out.println(arr[n]);
    }
}
