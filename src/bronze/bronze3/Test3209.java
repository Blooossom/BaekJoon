package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;
public class Test3209 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),":");

        int H1 = Integer.parseInt(st.nextToken());
        int M1 = Integer.parseInt(st.nextToken());
        int S1 = Integer.parseInt(st.nextToken());

        System.out.println(H1+":"+M1+":"+S1);
        int H2 = Integer.parseInt(st.nextToken());
        int M2 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());

        System.out.println(H2+":"+M2+":"+S2);
        int Ha=0;
        int Ma=0;
        int Sa=0;

        if(S1>S2){
            Sa = S2-S1+60;
            Ma=-1;
        }else{
            Sa = S2-S1;
        }
        if(M1>M2){
            Ma = M2-M1+60;
            Ha=-1;
        }else{
            Ma= M2-M1;
        }
        if(H1>H2){
            Ha = H2 - H1 +24;
        }else{
            Ha = H2-H1;
        }

        StringBuilder sb = new StringBuilder();


    }
}
