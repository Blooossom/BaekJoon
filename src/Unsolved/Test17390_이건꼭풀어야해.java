package Unsolved;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Test17390_이건꼭풀어야해 {
    public static PriorityQueue<Integer> queue;
    public static int arr[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        arr = new int[N];
        int[] prefixSum = new int[N + 1];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i > 0) {
                prefixSum[i] = arr[i] + prefixSum[i - 1];
            }
            else {
                prefixSum[i] = arr[i];
            }
        }


        st = new StringTokenizer(br.readLine());
        queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int sp = Integer.parseInt(st.nextToken());
            int ep = Integer.parseInt(st.nextToken());
            Solution(sp, ep);
        }
        System.out.println(sb);

    }
    public static void Solution(int sp, int ep) {
        PriorityQueue<Integer> temp = new PriorityQueue<>(queue);
        int count = 1;
        int sum = 0;
        while(count <= ep) {
            int param = temp.poll();
            if (count >= sp && count <= ep) {
                sum += param;
            }
            count++;
        }
        sb.append(sum).append('\n');
    }
}
