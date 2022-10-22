package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test5032 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        System.out.println(bin(e,f,c));
    }
    public static int bin(int x, int y, int z){
        int answer = 0;
        int div=0;
        int remain=0;
        int input=x+y;
        while(true){
            div=input/z;
            remain=input%z;
            input=div+remain;
            answer += div;
            if(input<z){
                break;
            }
        }
        return answer;
    }
}
