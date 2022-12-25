package bronze.bronze2;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Test18406 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("");
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(Integer.parseInt(arr[i]));
        }
        int mid = str.length()/2;
        int sum = 0;
        int p = 0;
        while (!queue.isEmpty()) {
            if (p >= mid) {
                sum -= queue.poll();
            }
            else {
                sum += queue.poll();
            }
            p++;
        }

        if (sum == 0) {
            System.out.println("LUCKY");
        }
        else {
            System.out.println("READY");
        }
    }
}
