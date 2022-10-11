package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Test2605 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <N; i++) {
            int input= Integer.parseInt(st.nextToken());
            if(input>=list.size()){
                list.add(0,i+1);
            }else{
                list.add(list.size()-input,i+1);
            }
        }
        for (int i = 0; i <list.size(); i++) {
            System.out.print((list.get(i)+" "));
        }
    }

}
