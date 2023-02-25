package Unsolved;

import java.io.*;
import java.util.HashSet;

public class Test11608_Complexity {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }
        System.out.println(set.size() == 1 || set.size() == 2? 0:set.size() - 2);
    }
}
