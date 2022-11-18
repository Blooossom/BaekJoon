package AlgorithmSrc;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorAlgorithm {
    public static void main(String[] args) {
        int[][] arr = new int[5][2];
        arr[0][0] = 10;
        arr[0][1] = 200;
        arr[1][0] = 30;
        arr[1][1] = 300;
        arr[2][0] = 15;
        arr[2][1] = 150;
        arr[3][0] = 25;
        arr[3][1] = 100;
        arr[4][0] = 50;
        arr[4][1] = 250;
        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
                    public int compare(int[] o1, int[] o2){
                return o1[1]-o2[1];
            }
        });
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
        System.out.println();
        ArrayList<Node> list = new ArrayList<>();
        list.add(new Node(1,10));
        list.add(new Node(5,5));
        list.add(new Node(2,7));
        list.add(new Node(4,3));
        list.add(new Node(3,1));

        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o2.val-o1.val;
            }
        });
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i).idx+" "+list.get(i).val);
        }
    }
}
class Node{
    int idx;
    int val;
    public Node(int idx, int val){
        this.idx=idx;
        this.val=val;
    }
}
