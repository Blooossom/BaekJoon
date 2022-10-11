package bronze.bronze2;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test9076 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            int[] score = new int[5];
            int sum = 0;
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j <5; j++) {
                score[j]= Integer.parseInt(st.nextToken());
            }
            Arrays.sort(score);
            if(score[3]-score[1]>=4){
                System.out.print("KIN");
            }else{
                for (int j = 1; j <4; j++) {
                    sum += score[j];
                }
                System.out.print(sum);
            }
            System.out.println();
        }
    }
}
