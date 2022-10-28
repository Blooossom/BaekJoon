package bronze.bronze3;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test7510 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 1; i < T+1; i++) {
            st=new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int[] arr = {a,b,c};
            Arrays.sort(arr);
            if(Math.pow(arr[0],2)+Math.pow(arr[1],2)==Math.pow(arr[2],2)){
                System.out.println("Scenario #"+i+":\nyes");
            }else{
                System.out.println("Scenario #"+i+":\nno");

            }
            System.out.println();
        }
    }
}
