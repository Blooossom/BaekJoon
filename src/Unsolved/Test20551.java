package Unsolved;

import java.io.*;
import java.util.*;

public class Test20551 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            queue.offer(list.get(i));
        }
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(queue);
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(!queue.contains(arr.get(i))){
                sb.append(-1).append('\n');
            } else {
                while (true) {
                    int p = queue.poll();
                    count++;
                    if (p == arr.get(i)) {
                        sb.append(count).append('\n');
                        break;
                    }
                }

            }
            System.out.println(queue);
            System.out.println(sb);
        }
        System.out.println(sb);
    }
}
