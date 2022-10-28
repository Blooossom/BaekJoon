package Unsolved;
import java.util.Scanner;

public class Test1673 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
                int chicken = n;
                while (true) {
                    n = n / k;
                    chicken += n;
                    if (n < k) {
                        break;
                    }
                }
                System.out.println(chicken);
            }
        }
}
