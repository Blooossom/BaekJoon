package bronze.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class Test5622 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int value=0;
        for (int i = 0; i <str.length(); i++) {
            switch (str.charAt(i)){
                case 'A' : case 'B' : case 'C':
                    value +=3;
                    break;
                case 'D' : case 'E' : case 'F' :
                    value +=4;
                    break;
                case 'G' : case 'H' : case 'I' :
                    value +=5;
                    break;
                case 'J' : case 'K' : case 'L' :
                    value +=6;
                    break;
                case 'M' : case 'N' : case 'O' :
                    value +=7;
                    break;
                case 'P' : case 'Q' : case 'R' : case 'S' :
                    value +=8;
                    break;
                case 'T' : case 'U' : case 'V' :
                    value +=9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    value+=10;
                    break;
            }

        }System.out.println(value);

    }
}
