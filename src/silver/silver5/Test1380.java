package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class Test1380 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        while(true){
            int T = Integer.parseInt(br.readLine());
            if(T==0){break;}
            String[] name = new String[T];
            for (int i = 0; i < name.length; i++) {
                name[i] = br.readLine();
            }
            StringTokenizer st;
            boolean[] arr = new boolean[T];
            for (int i = 0; i < 2 * T - 1; i++) {
                st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                String input = st.nextToken();
                arr[A - 1] = !arr[A - 1];
            }

            for (int j = 0; j < name.length; j++) {
                 if(arr[j]){
                     System.out.println(count +" "+name[j]);
                     count++;
                 }
            }
        }
    }
}
