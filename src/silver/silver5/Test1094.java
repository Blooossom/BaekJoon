package silver.silver5;

import java.io.*;
public class Test1094 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = {1,2,4,8,16,32,64};
        int count = 0;

            for (int i = arr.length-1; i >=0 ; i--) {
                if(T>=arr[i]){
                    T-=arr[i];
                    count++;
                }
            }

        System.out.println(count);
    }
}
