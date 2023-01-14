import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        HashSet<List<Character>> set = new HashSet<>();
        List<Character> list = new ArrayList<>();
        int[] arr = new int[26];
        System.out.println(65 - 'A');
        char[] arr1 = {'c', 'a', 'g'};
        Arrays.sort(arr1);
        char[] arr2 = {'g', 'a', 'c'};
        Arrays.sort(arr2);
        System.out.println(arr1.equals(arr2));

        list.add('c');
        list.add('a');
        list.add('g');
        set.add(list);
        list.remove(0);
        list.add('c');
        System.out.println(set.contains(list));
        set.add(list);
        System.out.println(set);
    }
}
