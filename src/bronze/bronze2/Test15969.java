package bronze.bronze2;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test15969 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        for (int i = 0; i <T; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(arr[arr.length-1]-arr[0]);
        System.out.println(sb);
        }
    }

