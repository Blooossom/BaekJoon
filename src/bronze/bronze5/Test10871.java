package bronze.bronze5;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Test10871{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int value;
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            value = Integer.parseInt(st.nextToken());
            if(value<X){
                sb.append(value).append(' ');
            }
        }
        System.out.println(sb);
        //10 5
        //1 10 4 9 2 3 8 5 7 6
    }
}