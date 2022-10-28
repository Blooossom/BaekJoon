package Unsolved;
import java.io.*;
public class Test16561 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <n/3; i++) {
            for (int j = 1; j <n/3; j++) {
                for (int k = 1; k <n/3; k++) {
                    if(n%(3*i+3*j+3*k)==0){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
