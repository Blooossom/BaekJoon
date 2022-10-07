package bronze.bronze3;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test3047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr= new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i <3; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <3; i++) {
            if(str.charAt(i)=='A'){
                sb.append(arr[0]);
            }else if(str.charAt(i)=='B'){
                sb.append(arr[1]);
            }else{
                sb.append(arr[2]);
            }
            sb.append(" ");

        }
        System.out.println(sb);
    }

}
