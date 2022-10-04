package bronze.bronze1;

import java.util.Scanner;
public class Test1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        int[] tmp = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int sum =0;
        for (int i = 0; i <M-1; i++) {
            sum += tmp[i];
        }
        int answer = (sum+D)%7;
        for (int i = 0; i <arr.length; i++) {
            if(answer==i){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
