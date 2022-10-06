package bronze;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuickSortTest {
    public static void sort(int[] arr){
        pivot_sort(arr, 0, arr.length-1);
    }
    private static void pivot_sort(int[] arr, int lo, int hi){
        if(lo>=hi){
            return;
        }
        int pivot = partition(arr, lo, hi);

        pivot_sort(arr, lo, pivot-1);
        pivot_sort(arr, pivot+1,hi);
    }
    private static int partition(int[] arr, int left, int right){
        int lo = left;
        int hi = right;
        int pivot = arr[left];

        while(lo<hi){

            while(arr[hi]>pivot&&lo<hi){
                hi--;
            }
            while(arr[lo]<=pivot&&lo<hi){
                lo++;
            }
            swap(arr, lo, hi);
        }
        swap(arr, left, lo);

        return lo;
    }
    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        sort(arr);

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
