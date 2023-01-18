import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TestPage {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        StringTokenizer st = new StringTokenizer(input.readLine());
        int houseNum = Integer.parseInt(st.nextToken());
        ArrayList<Integer> houseArr = new ArrayList<>(houseNum);
        int pointer = 0;


        if(houseNum == 1) { //배열 크기가 1이라면 1출력 후 끝
            System.out.println(1);
            return;
        }

        st = new StringTokenizer(input.readLine());

        for(int i = 0; i < houseNum; i++){ //배열에 값 집어넣기
            houseArr.add(Integer.parseInt(st.nextToken()));
        }
        //만약 모든 값이 같다면 0 출력하고 끝
        if(Collections.frequency(houseArr, houseArr.get(0)) == houseNum){
            System.out.println(0);
            return;
        }

        for(int i = 0; i < houseNum - 1; i++){
            if(houseArr.get(i) == houseArr.get(i + 1)) { //같은 값이 나올때만 길이를 구해서 저장하고 포인터 이동해줌
                tm.put(i - pointer + 1, 0);
                pointer = i + 1;
            }
        }

        if(tm.isEmpty()){
            tm.put(houseNum, 0);
        }

        System.out.println(tm.lastKey()); //가장 큰 값을 출력
    }
}