import java.util.Arrays;
import java.util.Scanner;
public class Test10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int[] arr = new int[26];

        for (int i = 0; i <str.length(); i++) {
            arr[str.charAt(i)-97]++;
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
