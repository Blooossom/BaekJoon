import java.util.Scanner;
public class Test11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[100];
        for (int i = 0; i <arr.length; i++) {
            if(sc.nextLine()==null){
                break;
            }
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i <arr.length; i++) {
            if(arr!=null){
                System.out.println(arr[i]);
            }
        }

        }

    }