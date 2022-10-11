package bronze.bronze2;
import java.io.*;
public class Test5585 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int R = 1000-T;
        int coin = 0;

        while(true) {
            if (R >= 500) {
                R -= 500;
                coin++;
            } else break;
        }
        while(true){
            if(R>=100){
                R -= 100;
                coin++;
            }else break;
        }
        while(true){
            if(R>=50){
                R -=50;
                coin++;
            }else break;
        }
        while (true) {
            if(R>=10){
                R -=10;
                coin++;
            }else break;
        }
        while(true){
            if(R>=5){
                R-=5;
                coin++;
            }else break;
        }
        while(true){
            if(R>0){
                R-=1;
                coin++;
            }else if(R==0){break;}
        }
        System.out.print(coin);
    }
}
