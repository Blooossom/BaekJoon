package bronze.bronze5;

import java.util.Scanner;
public class Test2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int answer = Math.abs(N-M);

        System.out.println(answer);
    }
}
