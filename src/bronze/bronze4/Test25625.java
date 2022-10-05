package bronze.bronze4;
import java.util.Scanner;
public class Test25625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        if(X<Y){
            System.out.println(Y-X);
        }else System.out.println(X+Y);
    }
}
