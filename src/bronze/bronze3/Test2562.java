package bronze.bronze3;

import java.io.*;

public class Test2562 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i <arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
                maxIndex=i+1;
            }

        }System.out.println(max);
        System.out.println(maxIndex);
    }
}
