package bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class Test14720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        for (int i = 0; i <arr.length; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        int count = 0;
        int start = -1;
        int point=0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == point) {
                start=i;
                count++;
                break;
            }
        }
        if (start < 0) {
            System.out.println(0);
            return;
        }
        for (int i = start; i <arr.length; i++) {
            if (point == 2&&arr[i] == 0) {
                count++;
                point=0;
            }else{
                if(arr[i]==point+1){
                    count++;
                    point++;
                }
            }
        }
        System.out.println(count);
    }
}
