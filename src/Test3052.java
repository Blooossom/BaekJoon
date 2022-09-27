import java.io.*;
import java.util.Arrays;

public class Test3052 {//서로 다른 값 출력하는 거임
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = new int[10];
        for(int i=0; i<arr1.length; i++){
            arr1[i]= Integer.parseInt(br.readLine());
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[arr1.length];
        for(int i=0; i<arr2.length; i++){
            arr2[i]=arr1[i]%42;
        }
        System.out.println(Arrays.toString(arr2));
        int count=0;
        for (int i = 0; i < arr2.length; i++) {
            for(int j=0; j<i; j++){
                if(arr2[i]==arr2[j]){
                    count++;
                }//if
            }//forj
        }//fori
        System.out.println(count);
    }//main
}//class
