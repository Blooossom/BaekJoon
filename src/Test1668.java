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
        while(i==arr.length-1){
            if(arr[i-1]<arr[i]){
                left++;
                i = i;
            }else{
                i++;
            }
        }
        int j = 1;
        while (j == arr.length - 1) {
            if(arr[arr.length-j]>arr[arr.length-1-j]){
                right++;
                j=j;
            }else{
                j++;
            }
        }
        System.out.println(left);
        System.out.println(right);
    }
}
