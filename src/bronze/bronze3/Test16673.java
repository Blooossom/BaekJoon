package bronze.bronze3;
import java.util.Scanner;
public class Test16673 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();

        int answer = 0;
        for (int i = 1; i <=c; i++) {
            answer += (k*i)+(p*(int)Math.pow(i,2));
        }
        System.out.println(answer);
    }
}
