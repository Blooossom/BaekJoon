package Unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Test8932 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        double[] A={9.23076,1.84523,56.0211,4.99087,0.188807,15.9803,0.11193};
        double[] B={26.7,75,1.5,42.5,210,3.8,254};
        double[] C= {1.835,1.348,1.05,1.81,1.41,1.04,1.88};
        boolean[] track = {true,false,false,true,false,false,true};
        int[] arr = new int[7];
        for (int i = 0; i <T; i++) {
            int answer = 0;
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                int P = Integer.parseInt(st.nextToken());
                answer+=calc(A[j],B[j],C[j],track[j],P);
            }
            System.out.println(answer);
        }
    }
    public static int calc(double A, double B, double C, boolean track, int P){
        if(track){
            return (int)(A*(Math.pow((B-P),C)));
        }else {
            return (int)(A*(Math.pow((P-B),C)));

        }
    }
}