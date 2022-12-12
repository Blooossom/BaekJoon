package bronze.bronze1;

import java.io.*;
public class Test2684 {
    static int TTT = 0;
    static int TTH = 0;
    static int THT = 0;
    static int THH = 0;
    static int HTT = 0;
    static int HTH = 0;
    static int HHT = 0;
    static int HHH = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            for (int j = 0; j < 38; j++) {
                String temp = str.substring(j, j+3);
                Coin(temp);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(TTT).append(" ")
                    .append(TTH).append(" ")
                    .append(THT).append(" ")
                    .append(THH).append(" ")
                    .append(HTT).append(" ")
                    .append(HTH).append(" ")
                    .append(HHT).append(" ")
                    .append(HHH);
            System.out.println(sb);
            InitializeCoin();
        }

    }
    static void InitializeCoin(){
        TTT = TTH = THT = THH = HTT = HTH = HHT = HHH = 0;
    }
    static void Coin(String str){
        switch(str){
            case "TTT":
                TTT++;
                break;
            case "TTH":
                TTH++;
                break;
            case "THT":
                THT++;
                break;
            case "THH":
                THH++;
                break;
            case "HTT":
                HTT++;
                break;
            case "HTH":
                HTH++;
                break;
            case "HHT":
                HHT++;
                break;
            case "HHH":
                HHH++;
                break;
        }
    }
}
