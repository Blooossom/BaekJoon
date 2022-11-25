package silver.silver5;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Test4821 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            int T = Integer.parseInt(br.readLine());
            if(T==0){
                break;
            }
            st = new StringTokenizer(br.readLine(),",");
            int count = st.countTokens();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i <count; i++) {
                StringTokenizer rest = new StringTokenizer(st.nextToken(), "-");
                if (rest.countTokens() == 1) {
                    int temp = Integer.parseInt(rest.nextToken());
                    if(temp<=T) {
                        set.add(temp);
                    }
                    continue;
                }
                int low = Integer.parseInt(rest.nextToken());
                int high = Integer.parseInt(rest.nextToken());
                if(high<=T&&low<=T){
                    if(low==high){
                        set.add(low);
                    }
                    if(low<high){
                        for (int j = low; j <=high; j++) {
                            set.add(j);
                        }
                    }
                }
                if(high>T&&low<=T){
                    for (int j = low; j <=T; j++) {
                        set.add(j);
                    }
                }
            }
            System.out.println(set.size());
        }
    }
}
