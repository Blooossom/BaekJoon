package bronze;
import java.io.*;
import java.util.StringTokenizer;

public class Test1173 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int count = 0;
        int result = m;
        int time = 0;
        while(true){
            time++;
            if(result+T <= M){
                count++;
                result = result+T;
            }else{
                result = result-R;
                if(result-R<m){
                    result = m;
                }
            }
            }
        if(count!=N){
            System.out.println(-1);
        }else if(count==N){
            System.out.println(time);
        }
    }
}
