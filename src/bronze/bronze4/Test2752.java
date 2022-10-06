package bronze.bronze4;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test2752 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[3];

        for (int i = 0; i <3; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2; j++) {
                if(arr[i]<arr[j]){
                    int tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <3; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}

// 1. Arrays.sort 사용
//for (int i = 0; i <3 ; i++) {
//            arr[i]= Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i <3; i++) {
//            sb.append(arr[i]).append(" ");
//        }
//        System.out.print(sb);

// 2. Insert Sort 사용
//for (int i = 0; i <3 ; i++) {
//            for (int j = 0; j <2; j++) {
//                if(arr[i]<arr[j]){
//                    int tmp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=tmp;
//                }
//            }
//        }