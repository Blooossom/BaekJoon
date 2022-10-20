package bronze;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test10804 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] card = new int[20];
        for (int i = 0; i <20; i++) {
            card[i]=i+1;
        }

        for (int i = 0; i <10; i++) {
            st=new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            reverseSort(card, A,B);
        }
        System.out.println(Arrays.toString(card));
    }
    public static void reverseSort(int[] arr, int start, int end){
        if((end-start)%2==0){
            for (int i = 0; i <(end-start+1)/2; i++) {
                int tmp = 0;
                tmp=arr[start-1+i];
                arr[start-1+i]=arr[end-i-1];
                arr[end-i-1]=tmp;
            }
        }else{
            for (int i = 0; i <(end-start)/2; i++) {
                int tmp=0;
                tmp=arr[start-1+i];
                arr[start-1+i]=arr[end-1-i];
                arr[end-1-i]=tmp;
            }
        }
    }
}
