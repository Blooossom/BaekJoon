import java.util.Scanner;

public class Test4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt();
            int M = sc.nextInt();
            if(N==0 && M==0)break;

            System.out.println(N>M? "Yes" : "No");
        }
    }
}
