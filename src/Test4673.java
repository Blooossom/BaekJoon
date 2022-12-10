import java.io.*;
import java.nio.Buffer;

public class Test4673 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[10001];
        int i = 1;
        while (true) {
            arr[selfNumber(i)] = true;
            i++;
            if(i >= 10000){
                break;
            }
        }
        for (int j = 1; j < arr.length; j++) {
            if(!arr[j]){
                System.out.println(j);
            }
        }
    }
    static int selfNumber(int p){
        String temp = Integer.toString(p);
        String[] arr = temp.split("");
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += Integer.parseInt(arr[i]);
        }
        res += p;
        return res;
    }
}
