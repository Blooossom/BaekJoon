package bronze.bronze2;

import java.io.*;
import java.util.Stack;

public class Test17608 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(br.readLine());
        Stack<Integer> tower = new Stack<>();
        for (int i = 0; i < height; i++) {
            tower.add(Integer.parseInt(br.readLine()));
        }
        int count = 1;
        int max = tower.pop();
        while(!tower.isEmpty()){
            int temp = tower.pop();
            if (max < temp) {
                max = temp;
                count++;
            }
        }
        System.out.println(count);
    }
}
