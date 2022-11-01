package Unsolved;

import java.io.*;
import java.util.StringTokenizer;
public class Test2869 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int answer = (V-B)/(A-B);
        if (answer == 1) {
            System.out.println(2);
        }else{
            System.out.println(answer);
        }
        /*
        a
        a-b
        2a-b
        2a-2b
        3a-2b
        3a-3b
        4a-3b
        4a-4b
        day=x
        xa-(x-1)b일떄 정상에 도달한다면
        xa-xb+b
        (a-b)x+b=v
        x=(v-b)/(a-b)

         */
    }
}
