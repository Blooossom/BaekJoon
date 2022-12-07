package silver.silver2;

import java.io.*;
import java.util.StringTokenizer;

public class Test16953 {
    static int count = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        if (B % 10 != 1) {
            System.out.println(-1);
            return;
        }
        System.out.println(solution(A, B));
    }
    static int solution(int p, int q){
        if(q == p){
            return count;
        }
        if(p > q){
            return -1;
        }
        count++;
        if(q % 2 == 0){
            return solution(p, divideTwo(q));
        } else {
            return solution(p, subtractOne(q));
        }
    }
    static int divideTwo(int p){
        int res = 0;
        res = p / 2;
        System.out.println(res);
        return res;
    }
    static int subtractOne(int p){
        int res = 0;
        if (p > 10 && p % 10 != 1) {
            return -1;
        } else {
            res = (p - 1)/10;
        }
        System.out.println(res);

        return res;
    }
}
