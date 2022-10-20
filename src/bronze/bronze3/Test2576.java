package bronze.bronze3;
import java.io.*;
public class Test2576 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(br.readLine());
        }
        int sum = 0;
        int min = 100;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%2!=0){
                sum += arr[i];

            if(min>arr[i]){
                min=arr[i];
            }
            }
        }
        if(sum==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
