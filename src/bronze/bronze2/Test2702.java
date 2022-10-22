package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test2702 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(lcm(A,B)+" "+gcd(A,B));
        }



    }
    public static int gcd(int x, int y){
        int answer = 0;
        int r;
        while(true){
            r = x%y;//5 2 1 0
            if(r==0){
                answer = y;
                break;
            }
            x=y;//5 10 5 2 1
            y=r;//10 5 2 1 0
        }
        return answer;
    }

    public static int lcm(int x, int y){
        int answer = 0;
        answer = (int)Math.abs(x*y)/gcd(x,y);
        return answer;
    }
}
