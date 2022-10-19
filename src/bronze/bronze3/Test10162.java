package bronze.bronze3;
import java.io.*;
public class Test10162 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int A = 300;
        int B = 60;
        int C = 10;
        int[] count = new int[3];

        while(T>=A){
            T=T-A;
            count[0]++;
            if(T==0){
                System.out.println(count[0]+" "+count[1]+" "+count[2]);
            }
        }

        while(T>=B){
            T=T-B;
            count[1]++;
            if(T==0){
                System.out.println(count[0]+" "+count[1]+" "+count[2]);
            }
        }

        while(T>=C){
            T=T-C;
            count[2]++;
            if(T==0){
                System.out.println(count[0]+" "+count[1]+" "+count[2]);
            }
        }
        if(T!=0){
            System.out.println(-1);
        }


    }
}
/*

 */
