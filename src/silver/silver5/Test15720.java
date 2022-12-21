package silver.silver5;

import java.io.*;
import java.util.*;

public class Test15720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int buggerCount = Integer.parseInt(st.nextToken());
        int sideCount = Integer.parseInt(st.nextToken());
        int drinkCount = Integer.parseInt(st.nextToken());
        ArrayList<Integer> buggerList = new ArrayList<>();
        ArrayList<Integer> sideList = new ArrayList<>();
        ArrayList<Integer> drinkList = new ArrayList<>();
        int preSum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < buggerCount; i++) {
            buggerList.add(Integer.parseInt(st.nextToken()));
            preSum += buggerList.get(i);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sideCount; i++) {
            sideList.add(Integer.parseInt(st.nextToken()));
            preSum += sideList.get(i);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < drinkCount; i++) {
            drinkList.add(Integer.parseInt(st.nextToken()));
            preSum += drinkList.get(i);
        }
        Collections.sort(buggerList, Collections.reverseOrder());
        Collections.sort(sideList, Collections.reverseOrder());
        Collections.sort(drinkList, Collections.reverseOrder());
        int loop = Math.min(Math.min(buggerCount, sideCount), drinkCount);
        int resSum = 0;
        for (int i = 0; i < loop; i++) {
            resSum += (buggerList.get(0) * 0.9) + (sideList.get(0) * 0.9) + (drinkList.get(0) * 0.9);
            drinkList.remove(0);
            buggerList.remove(0);
            sideList.remove(0);
        }
        while(drinkList.size()!=0){
            resSum += drinkList.get(0);
            drinkList.remove(0);
        }

        while(sideList.size()!=0){
            resSum += sideList.get(0);
            sideList.remove(0);
        }

        while(buggerList.size()!=0){
            resSum += buggerList.get(0);
            buggerList.remove(0);
        }
        System.out.println(preSum);
        System.out.println(resSum);
    }
}
