import java.io.*;
import java.util.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = {'a','b','c','d','e'};
        int A = 0;
        int B = 0;
        A = getChar(arr);
        B = getChar(arr);

    }
    static int getChar(char[] arr) {
        int head = 0;
        int tail = 0;
        int pos;
        char ret;
        pos = head;
        ret = arr[pos];
        pos = (pos + 1) % 5;
        head = pos;
        return ret;
    }
}
