package silver.silver3;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Test14425 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(br.readLine());
        }
        for(int i=0; i<m; i++){
            list2.add(br.readLine());
        }
        int count=0;
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list2.size(); j++){
                if(list.get(i).equals(list2.get(j))){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
