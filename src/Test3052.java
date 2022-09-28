import java.io.*;
import java.util.Arrays;

public class Test3052 {//서로 다른 값 출력하는 거임
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];

        for (int i = 0; i <10; i++) {
            arr[Integer.parseInt(br.readLine())%42]=true;
        }
        int count =0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==true){
                count++;
            }
        }
        System.out.println(count);
    }//main
}//class
