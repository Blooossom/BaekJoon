package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test5596 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int S=0;
        int T=0;
        for (int i = 0; i <4; i++) {

            S += Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine()," ");
        for (int j = 0; j <4; j++) {

            T += Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        if(S>=T){
            sb.append(S);
        }else sb.append(T);
        System.out.println(sb);
    }
}
