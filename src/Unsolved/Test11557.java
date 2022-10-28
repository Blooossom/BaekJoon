package Unsolved;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test11557 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            int N = Integer.parseInt(br.readLine());
            String[] str = new String[N];
            int[] arr = new int[N];
            for (int j = 0; j <N; j++) {
                st=new StringTokenizer(br.readLine()," ");
                str[j]=st.nextToken();
                arr[j]=Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j <(N-1); j++) {
                for (int k = 0; k <N; k++) {
                    if(arr[j]>arr[k]){
                        String tmp;
                        int temp = arr[j];
                        arr[j]=arr[k];
                        arr[k]=arr[j];

                        tmp = str[j];
                        str[j] = str[k];
                        str[k] = tmp;

                        System.out.print(str[0]);
                    }

                }

            }
        }
    }
}
