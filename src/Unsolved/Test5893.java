package Unsolved;
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Test5893 {//17배
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        BigInteger N = new BigInteger("0");

        for (int i = 0; i <input.length(); i++) {
            if(input.charAt(i)=='1'){
                N= N.add(new BigInteger("2").pow(input.length()-(i+1)));
            }else if(input.charAt(i)=='0'){
                N = N.add(new BigInteger("0"));
            }else if(input=="0"){
                bw.write(String.valueOf("0"));
            }
        }
        BigInteger answer = N.multiply(new BigInteger("17"));
        String output = "";
        while(answer != BigInteger.valueOf(0)){
            output += answer.mod(BigInteger.valueOf(2));
            answer = answer.divide(BigInteger.valueOf(2));
        }
        for (int i = output.length()-1; i >=0; i--) {
            bw.write(String.valueOf(output.charAt(i)));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
