package silver.silver4;

import java.io.*;
public class Test2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(Solution(N));
    }
    static int Solution(int p){
        int answer = 0;
        if (p == 4 || p == 7) {
            answer = -1;
        } else if (p % 5 == 1 || p % 5 == 3) {
            answer = (p / 5) + 1;
        } else if (p % 5 == 2 || p % 5 == 4){
            answer = (p / 5) + 2;
        } else if (p % 5 == 0) {
            answer = p / 5;
        }
        return answer;
    }
}
