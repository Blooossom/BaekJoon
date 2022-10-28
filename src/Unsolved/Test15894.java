package Unsolved;
import java.io.*;
public class Test15894 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long answer = 12;
        if (N == 1) {
            System.out.println(4);
        }else if(N==2){
            System.out.println(8);
        }else if(N==3){
            System.out.println(12);
        }else if(N>3){
            for (int i = 4; i <N+1; i++) {
                answer += i+3;

            }
            System.out.println(answer);
        }

    }
}
