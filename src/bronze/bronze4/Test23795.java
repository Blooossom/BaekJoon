package bronze.bronze4;
import java.io.*;
public class Test23795 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money=0;
        while(true){
            int A = Integer.parseInt(br.readLine());
            if(A==-1){break;}
            money+= A;
        }
        System.out.println(money);
    }
}
