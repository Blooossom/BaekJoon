package Unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test25644 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <T; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(Solution(list));
        }
        static int Solution(ArrayList<Integer> list) {
            int start = 0;
            int end = 1;
            int res = 0;
            if (res > list.get(end) - list.get(start)) {
                end++;
                return Solution(list);
            }

            return res;
        }
    }

