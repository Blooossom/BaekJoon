package Unsolved;

import java.io.*;
import java.util.Arrays;

public class Test1796_신기한키보드 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int len = input.length();
        int[] sp = new int[26];
        Arrays.fill(sp, -1);
        int[] ep = new int[26];
        Arrays.fill(ep, -1);
        for (int i = 0; i < len; i++) {
            int idx = input.charAt(i) - 97;
            if (sp[idx] != -1) {
                ep[idx] = i;
            }
            else {
                sp[idx] = i;
                ep[idx] = sp[idx];
            }
        }
        int[] distance = new int[26];
        int[] next = new int[26];
        for (int i = 0; i < sp.length; i++) {
            distance[i] = ep[i] - sp[i];
            if (i > 0) {
                next[i] = Math.min(Math.abs(ep[i - 1] - sp[i]), Math.abs(ep[i - 1] - ep[i]));
            }
        }
        int key = len;
        int num = 0;
        while (true) {
            if (sp[num] != -1) {
                break;
            }
            num++;
        }
        key += sp[num] + distance[num];
        for (int i = num + 1; i < 26; i++) {
            if (sp[i] != -1) {
            int min = Math.min(Math.abs(ep[i - 1] - sp[i]), Math.abs(ep[i - 1] - ep[i]));
            key += min + distance[i];
            }
        }
        System.out.println(Arrays.toString(next));
        System.out.println(Arrays.toString(distance));
        System.out.println(Arrays.toString(sp));
        System.out.println(Arrays.toString(ep));
        System.out.println(key);

    }
}
/*

 */