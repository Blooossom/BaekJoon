package bronze.bronze4;
import java.io.*;
public class Test25704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        System.out.print(ratio(N,P));
    }
    public static int ratio(int coupon, int price) {
        int[] arr = {price - 500, (price/10)*9, price - 2000, (price/4)*3};
        int min = 50000;
        if (coupon >= 20) {
            if (price <= 2000) {
                price = 0;
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                }
                price=min;
            }
        }
        if (coupon < 20 && coupon >= 15) {
            if (price <= 2000) {
                price = 0;
            } else {
                for (int i = 0; i < arr.length - 1; i++) {
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                }
                price=min;
            }
        }
        if (coupon < 15 && coupon >=10) {
            if (price <= 500) {
                price = 0;
            } else {
                price = (int)Math.min(arr[0],arr[1]);
                }
            }
        if(coupon<10&&coupon>=5){
            if (price <= 500) {
                price = 0;
            } else {
                price=arr[0];
                    }
        }
        return price;
    }
}



