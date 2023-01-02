package silver.silver1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test2313_보석구매하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            ArrayList<Jewel> dp = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[num];
            for (int j = 0; j < num; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int max;
            int start;
            int end;
            int temp;
            for (int j = 0; j < arr.length; j++) {
                temp = max = arr[j];
                start = j;
                end = j;
                for (int k = j + 1; k < arr.length; k++) {
                    temp += arr[k];
                    if (temp > max) {
                        max = temp;
                        end = k;
                    }
                }
                Jewel jewel = new Jewel(start, end, max);
                dp.add(jewel);
            }
            Collections.sort(dp, (o1, o2) -> {
                if (o1.value > o2.value) {
                    return -1;
                } else if (o1.value == o2.value) {
                    if (o1.ep - o1.sp > o2.ep - o2.sp) {
                        return 1;
                    } else if (o1.ep - o1.sp == o2.ep - o2.sp) {
                        if (o1.sp < o2.sp) {
                            return -1;
                        } else if (o1.sp == o2.sp) {
                            return 0;
                        }
                        else {
                            return 1;
                        }
                    } else {
                        return -1;
                    }
                }
                else {
                    return 1;
                }
            });
            System.out.println(dp);
            sum += dp.get(0).value;
            sb.append('\n');
            sb.append(dp.get(0).sp + 1).append(" ").append(dp.get(0).ep + 1);
        }
        sb.insert(0, sum);
        System.out.println(sb);
    }
    static class Jewel {
        int sp;
        int ep;
        int value;

        public Jewel(int sp, int ep, int value) {
            this.sp = sp;
            this.ep = ep;
            this.value = value;
        }

        @Override
        public String toString(){
            return sp + " " + ep + " " + value;
        }
    }
}