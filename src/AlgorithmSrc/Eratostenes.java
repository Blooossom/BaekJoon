package AlgorithmSrc;
import java.io.*;
import java.util.StringTokenizer;

public class Eratostenes {
    static boolean prime[];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        prime=new boolean[M+1];
        prime[0]=prime[1]=true;
        for (int i = 2; i*i <=M; i++) {
            if(!prime[i]){
                for (int j = i*i; j <=M ; j+=i) {
                    prime[j]=true;
                }
            }
        }
        for (int i = N; i <=M; i++) {
            if(!prime[i]) System.out.println(i);

        }
    }
}
