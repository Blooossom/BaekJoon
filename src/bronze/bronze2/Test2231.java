package bronze.bronze2;

import java.io.*;
public class Test2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = 0;
        for (int i = 0; i <N; i++) {
            if(N==cons(i)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(K);
    }
    public static int cons(int n){
        int answer = n;
        String input = Integer.toString(n);
        String[] arr = input.split("");
        for (int i = 0; i <arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
