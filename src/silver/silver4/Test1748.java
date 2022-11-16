package silver.silver4;

import java.io.*;
public class Test1748 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int i = input.length();
        int A = Integer.parseInt(input);
        System.out.println(calc(A,i));
    }
    public static int calc(int p, int q){
        int answer = 0;
        for (int i = q; i>0 ; i--) {
            int temp = p-((int)Math.pow(10,i-1)-1);
            p = (int)Math.pow(10,i-1)-1;
            answer += temp*i;
        }
        return answer;
    }
}

