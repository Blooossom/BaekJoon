package silver.silver5;

import java.io.*;
public class Test1427 {
    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
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
    private static void pivot_sort(int[] arr, int lo, int hi){
        if(lo>=hi){
            return;
        }
        int pivot = partition(arr, lo, hi);

        pivot_sort(arr, lo, pivot-1);
        pivot_sort(arr, pivot+1,hi);
    }
    public static void sort(int[] arr){
        pivot_sort(arr, 0, arr.length-1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(j);
        }
        System.out.println(sb.reverse());
    }
}
