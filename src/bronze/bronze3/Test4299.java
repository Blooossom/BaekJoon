package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test4299 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());
        if(sum==0&&sub==0){
            System.out.println(0+" "+0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <1001; i++) {
            for (int j = 0; j <1001; j++) {
                if(i+j==sum&&Math.abs(i-j)==sub&&i>j){
                    sb.append(i).append(" ").append(j);
                }
            }
        }
        if(sb.toString().equals("")){
            System.out.println(-1);
        }else {
            System.out.print(sb);
        }
    }
}
