import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test2012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> pre = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            pre.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(pre);
        ArrayList<Integer> real = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            real.add(i);
        }
        int complain = 0;
        for (int i = 0; i < pre.size(); i++) {
            if(pre.get(i) != real.get(i)){
                complain += Math.abs(real.get(i) - pre.get(i));
            }
        }
        br.close();
        System.out.println(complain);
    }
}
