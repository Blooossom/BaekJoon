package bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6763 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int speed = Integer.parseInt(br.readLine());
        int limit = Integer.parseInt(br.readLine());
        int tar = limit-speed;
        int fine = 0;
        if(tar>=31){
            fine = 500;
        }else if(tar>=21&&tar<=30){
            fine=270;
        }else if(tar>=1&&tar<=20){
            fine=100;
        }
        if(fine>0) {
            System.out.println("You are speeding and your fine is $" + fine + ".");
        }else{
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
