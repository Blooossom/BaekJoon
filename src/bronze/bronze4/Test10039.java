package bronze.bronze4;
import java.io.*;
public class Test10039 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        int total = 0;
        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]<40){
                arr[i]=40;
            }
            total += arr[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(total/5);
        System.out.println(sb);




    }
}
