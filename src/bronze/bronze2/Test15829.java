package bronze.bronze2;

import java.io.*;
import java.util.ArrayList;

public class Test15829 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            list.add((int)input.charAt(i)-96);
        }
        System.out.println(hashing(list));
    }
    public static int hashing(ArrayList<Integer> list){
        int answer = 0;
        int r = 31;
        int m = 1234567891;
        for (int i = 0; i <list.size(); i++) {
            answer += (list.get(i)*Math.pow(r,i))%m;
        }
        return answer;
    }
}
