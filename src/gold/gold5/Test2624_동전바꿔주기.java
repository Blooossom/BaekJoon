package gold.gold5;

import java.io.*;
import java.util.*;

public class Test2624_동전바꿔주기 {

    static int[] dp; //Money 원을 만들 수 있는 방법 수 table 생성
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Money = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        dp = new int[Money + 1];
        dp[0] = 1; //0 원을 만들 수 있는 방법 -> 1가지
        ArrayList<Coin> list = new ArrayList<>(); //동전을 담아 줄 리스트
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            Coin coin = new Coin(p, q);
            list.add(coin);
        }
        for (int i = 0; i < count; i++) {
            int temp = list.get(i).price; //현재 동전 가격
            for (int j = Money; j >= temp; j--) {
                for (int k = 1; k <= list.get(i).num; k++) {
                    if (j - temp * k < 0) {
                        break;
                    }
                    dp[j] += dp[j - (temp * k)];
                }
            }
        }
        System.out.println(dp[Money]);
    }
    static class Coin { //동전 클래스(가격, 개수)
        int price;
        int num;

        public Coin(int price, int num) {
            this.price = price;
            this.num = num;
        }
    }
}
