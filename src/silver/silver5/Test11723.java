package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[20];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            if (input.equals("all")) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j]=true;
                }
            } else if (input.equals("empty")) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j]=false;
                }
            } else {
                int value = Integer.parseInt(st.nextToken());
                if(input.equals("add")){
                    arr[value-1]=true;
                }else if(input.equals("remove")){
                    arr[value-1]=false;
                }else if(input.equals("toggle")){
                    arr[value-1]=!arr[value-1];
                }else if(input.equals("check")){
                    if(arr[value-1]){
                        sb.append(1+"\n");
                    }else{
                        sb.append(0+"\n");
                    }
                }
            }
        }
        System.out.println(sb);

    }
}
