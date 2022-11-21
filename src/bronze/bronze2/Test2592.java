package bronze.bronze2;

import java.io.*;
public class Test2592 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[1001];
        int avg = 0;
        int input = 0;
        for (int i = 0; i <10; i++) {
            input = Integer.parseInt(br.readLine());
            arr[input]++;
            avg+=input/10;
        }
        int max = 0;
        int count = 0;
        for (int i = 0; i <arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
                count = i;
            }
        }
        System.out.println(avg);
        System.out.println(count);
    }
}
