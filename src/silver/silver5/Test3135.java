package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class Test3135 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        int Button = 0;
        int[] arr = new int[N];
        for (int i = 0; i <arr.length; i++) {
            arr[i]= Integer.parseInt(br.readLine());
        }
        int min = Math.abs(A-B);
        int tmp = A;
        for (int i = 0; i <arr.length; i++) {
            if(min>Math.abs(arr[i]-B)){
                min=Math.abs(arr[i]-B);
                Button++;
                tmp=arr[i];
            }
        }
        if(Button>0){
            Button=1;
        }
        if(tmp>B){
            System.out.println(tmp-B+Button);
        }else{
            System.out.println(B-tmp+Button);
        }

    }
}
