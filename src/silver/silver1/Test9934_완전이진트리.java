package silver.silver1;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Test9934_완전이진트리 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int size = (int)Math.pow(2, N) - 1;
        int[] node = new int[size];
        ArrayList<LinkedList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(new LinkedList<>());
        }
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < node.length; i++) {
            node[i] = Integer.parseInt(st.nextToken());
        }
        func(list, node, 0, node.length, 0);
        for (int i = 0; i < N; i++) {
            for (Integer num:list.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    static void func(ArrayList<LinkedList<Integer>> list, int[] node, int sp, int ep, int depth) {
        if (sp == ep) return;
        int mid = (sp + ep) / 2;

        list.get(depth).add((node[mid]));

        func(list, node, sp, mid, depth + 1);
        func(list, node, mid + 1, ep, depth + 1);
    }
}
