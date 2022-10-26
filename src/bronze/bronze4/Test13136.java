package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test13136 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long x = CCTV(R,N);
        long y = CCTV(C,N);
        System.out.println(x*y);

    }
    public static int CCTV(int a, int b){
        int answer=0;
        if (a % b != 0) {
            answer=a/b+1;
        }else{
            answer=a/b;
        }
        return answer;
    }
}

