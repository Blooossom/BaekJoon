package AlgorithmSrc;

import java.util.ArrayList;
import java.util.Collections;

public class GreedyAlgorithm {
    public static void main(String[] args) {
    ArrayList<ActionSection> list = new ArrayList<>();
    list.add(new ActionSection("A",7,8));
    list.add(new ActionSection("B",5,7));
    list.add(new ActionSection("C",3,6));
    list.add(new ActionSection("D",1,2));
    list.add(new ActionSection("E",6,9));
    list.add(new ActionSection("F",10,11));
    Collections.sort(list);
    //greedy 수행후 결과 출력
    ArrayList<ActionSection> answer = greedy(list);
        for (ActionSection actionSection:answer) {
            System.out.print(actionSection.name + ", ");
        }

    }
    //Greedy 알고리즘을 통해 선택된 활동들을 반환
    private static ArrayList<ActionSection> greedy(ArrayList<ActionSection> list){
        int time = 0;
        ArrayList<ActionSection> answer = new ArrayList<>();
        for (ActionSection act:list) {
            if (time <= act.start) {
                time=act.end;
                answer.add(act);
            }
        }
        return answer;
    }
    //활동 정보를 가지는 클래스를 Comparable로 구현 종료 시간 기준 오름차순으로 정렬함
    static class ActionSection implements Comparable<ActionSection>{
        String name;
        int start;
        int end;

        public ActionSection(String name, int start, int end) {
            this.name = name;
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(ActionSection action){
            return this.end-action.end;
        }

        @Override
        public String toString(){
            return this.name;
        }
    }
}
