package bronze.bronze1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test8974 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(solution(A,B));
    }
    public static int solution(int a, int b){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <1000; i++) {
            for (int j = 0; j <i; j++) {
                list.add(i);
                if(list.size()==b){
                    break;
                }
            }
        }
        int sum = 0;
        for (int i = a-1; i <=b-1; i++) {
            sum+=list.get(i);
        }
        return sum;
    }
}
