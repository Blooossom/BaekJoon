package bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSortTest {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];

        for (int i = 0; i <N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i]; j++) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
        System.out.println(arr[10000]);
    }
}
//int[] arr = new int[N];//if N =천만이면 arr.length도 천만임
//
//        for (int i = 0; i < arr.length; i++) {//이 for문은 arr[999만9999]까지 입력받음
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        int[] count = new int[arr.length];//count 배열도 길이 천만임
//
//        for (int i = 0; i <count.length; i++) {
//            count[arr[i]] += 1;
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i <count.length; i++) {
//            for (int j = 0; j <count[i]; j++) {
//                sb.append(i).append("\n");
//            }
//        }
//        System.out.println(sb);
