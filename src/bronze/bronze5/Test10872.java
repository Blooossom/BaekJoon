package bronze.bronze5;

import java.util.Scanner;
public class Test10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result=1;
        for (int i = 1; i<=N ; i++) {
            if (N == 0) {
                result = 1;
            } else {
                result = result* i;
            }
        }
        System.out.println(result);
    }
}
