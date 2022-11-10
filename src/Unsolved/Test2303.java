package Unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test2303{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int sum = 0;
        int res = -1;
        int[] arr = new int[5];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <T; i++) {
            int max = 0;
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j <arr.length; j++) {
                arr[j]= Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j <3; j++) {
                for (int k = i+1; k <4; k++) {
                    for (int l = j+1; l <5; l++) {
                        sum=arr[k]+arr[j]+arr[l];
                        if(max<sum%10){
                            max=sum%10;
                        }
                    }
                }
            }
            list.add(max);
        }
        int num = -1;
        for (int j = 0; j <T; j++) {
            if(res<=list.get(j)){
                res=list.get(j);
                num=j+1;
            }
        }
        System.out.println(num);
    }
}
