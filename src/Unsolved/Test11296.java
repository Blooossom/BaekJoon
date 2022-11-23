package Unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Test11296 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            st=new StringTokenizer(br.readLine());
            double money = Double.parseDouble(st.nextToken());
            String color = st.nextToken();
            String coupon = st.nextToken();
            String pay = st.nextToken();
            double disc = 1;
            switch (color){
                case "R":
                    disc-=0.45;
                    break;
                case "G":
                        disc-=0.30;
                        break;
                case "B":
                    disc-=0.20;
                    break;
                case "Y":
                    disc-=0.15;
                    break;
                case "O":
                    disc-=0.10;
                    break;
                case "W":
                    disc-=0.05;
                    break;
                default:
                    disc-=0;
                    break;
            }
            double price = money*disc;
            if(coupon.equals("C")){
                price=price*0.95;
            }
            StringBuilder sb =new StringBuilder();
            sb.append("$");
            if(pay.equals("P")){
                sb.append(String.format("%.2f",price));
            }else if (pay.equals("C")){
                price*=100;
                if((price%10)>5){
                    price=Math.ceil(price);
                }else{
                    price=Math.floor(price*0.1);
                }
                price*=0.1;
                sb.append(String.format("%.2f",price));
            }
            System.out.println(sb);
        }
    }
}
