import java.io.*;
import java.util.StringTokenizer;

public class Test4623 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            if(A==0||B==0||C==0||D==0){
                break;
            }
           int x = A*B;
            int y = C*D;
            System.out.println(x);
            System.out.println(y);
            double answer = Math.ceil(x/y);
            System.out.println(String.format("%.0f",answer));

        }
    }

}
