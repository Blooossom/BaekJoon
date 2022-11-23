import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test15738 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[A];
        ArrayList<Integer> list = new ArrayList<>();
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <A; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        K=list.get(K-1);
        for (int i = 0; i <M; i++) {
            int p = Integer.parseInt(br.readLine());
            int temp = 0;
            if(p>0){
                for (int j = 0; j <p; j++) {
                    temp = list.get(j);
                    list.set(j,temp.get(j));
                }
            }else{
                for (int j = 0; j <p*-1; j++) {
                    list.set(list.size()+p+j,temp.get(j));
                }
            }
            temp.clear();
        }
        System.out.println(list.indexOf(K)+1);
    }
}
