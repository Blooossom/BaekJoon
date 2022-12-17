package bronze.bronze1;

import java.io.*;
public class Test2810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String seat = br.readLine();
        int single = 0;
        int couple = 0;
        String[] seats = seat.split("");
        for (int i = 0; i < seats.length; i++) {
            if(seats[i].equals("S")){
                single++;
            }else{
                couple++;
            }
        }
        int cup = single + (couple/2) + 1;
        StringBuilder sb = new StringBuilder();
        if (cup < seat.length()) {
            sb.append(cup);
        } else {
            sb.append(seat.length());
        }
        System.out.println(sb);
    }
}
