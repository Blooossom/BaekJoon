import java.util.Scanner;
public class Test2439{
    public static void main(String[] args) {
        //첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        //하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){//i의 반복 1회차 때 블라 4개 애스터 1개
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}