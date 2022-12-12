import java.io.*;
import java.util.PriorityQueue;

public class Test1715 {
    public static void main(String[] args) throws IOException{
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            priorityQueue.offer(Integer.parseInt(br.readLine()));
        }


    }
    static int Solution(int parent, int leftChild, int rightChild){
        int res = 0;
        res = leftChild + parent;
        res += res + rightChild;
        return res;
    }
}
