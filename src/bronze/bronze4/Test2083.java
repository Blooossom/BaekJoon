package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test2083 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            if(name.equals("#")){
                return;
            }
            if(age>17||weight>=80){
                System.out.println(name + " Senior");
            }else{
                System.out.println(name + " Junior");
            }
        }
    }
}
