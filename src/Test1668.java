import java.io.*;
import java.util.Arrays;

public class Test1668 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i <N; i++) {
            arr[i]= Integer.parseInt(br.readLine());
        }
        System.out.println(Arrays.toString(arr));
        int left = 1;
        int right = 1;
        int i = 1;
        while(true) {
            if(i>arr.length-1){
                break;
            }
            if (arr[i - 1] < arr[i]) {
                left++;
            }
            i++;

        }
        int[] reverse = new int[N];
        for (int j = 0; j < reverse.length; j++) {
            reverse[j]=arr[arr.length-1-j];
        }
        int j = 0;
        int k = 0;
        System.out.println(Arrays.toString(reverse));
        while (true) {
            if(j>reverse.length-1){
                break;
            }
            if(reverse[j]<reverse[k]){
                right++;
                j=k;
            }
            k++;
            if(k>arr.length-1){
                break;
            }

        }
        System.out.println(left);
        System.out.println(right);
    }
}
