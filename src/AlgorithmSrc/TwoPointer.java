package AlgorithmSrc;

public class TwoPointer {
    public static void main(String[] args) {

    }
    public static int twoPointer(int[] arr, int m){
        int count = 0;
        int sp = 0;
        int ep = 0;
        int sum = 0;
        while (true) {
            if(sum>=m){
                sum -= arr[sp++];
            } else if (ep>=arr.length) {
                break;
            }else{
                sum += arr[ep++];
            }
            if(sum==m){
                count++;
            }
        }
        return count;
    }
}
