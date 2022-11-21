import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test11111111 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        label1:
        while(true){
            for (int i = 0; i <30; i++) {
                for (int j = 0; j <i; j++) {
                    sum+=i;
                    if(sum>=1000){
                        System.out.println(i);
                        break label1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
