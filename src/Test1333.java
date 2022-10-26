import java.io.*;
import java.util.StringTokenizer;

public class Test1333 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int x = L;
        int y = L+5;
        while(true){
            if(D>=x&&D<y){
                System.out.println(D);
                return;
            }
        }
    }
}

