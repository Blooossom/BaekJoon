package AlgorithmSrc;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    static boolean searchFunc(ArrayList<Integer> dataList, int searchItem) {
        if (dataList.size() == 1) {
            return searchItem == dataList.get(0);
        }
        if (dataList.size() == 0) {
            return false;
        }
        int mid = dataList.size() / 2;
        if (searchItem == dataList.get(mid)) {
            return true;
        } else {
            if (searchItem < dataList.get(mid)) {
                return searchFunc(new ArrayList<>(dataList.subList(0, mid)), searchItem);
            }
            else {
                return searchFunc(new ArrayList<>(dataList.subList(mid, dataList.size())), searchItem);
            }
        }
    }

    public static void main(String[] args) {
        int param = 11;
        int[] arr = {1, 3, 5, 7, 8, 11, 32, 44, 61, 77, 151, 235, 244, 451, 555};
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : arr) {
            list.add(j);
        }

        System.out.println(searchFunc(list, param));
    }
}
