package silver.silver4;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test9613 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            st=new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            for (int j = 0; j <K; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            long sum =0;
            int start = 0;
            int end;
            while(true){
                if(start==list.size()-1){
                    break;
                }
                end=start+1;
                while(true){
                    sum+=gcd(list.get(start),list.get(end));
                    if(end==list.size()-1){
                        break;
                    }
                    end++;
                }
                start++;
            }
            System.out.println(sum);
        }
    }
    static int gcd(int p, int q){
        if (q == 0) {
            return p;
        }else{
            return gcd(q, p%q);
        }
    }
}
