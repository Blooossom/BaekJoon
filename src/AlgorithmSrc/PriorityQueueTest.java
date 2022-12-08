package AlgorithmSrc;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueueLowest.add(1);
        priorityQueueLowest.add(10);
        priorityQueueLowest.offer(100);
        priorityQueueLowest.add(11);
        priorityQueueLowest.add(12);
        priorityQueueLowest.add(13);
        System.out.println(priorityQueueLowest.peek());
        System.out.println(priorityQueueLowest.poll());


        priorityQueueHighest.add(1);
        priorityQueueHighest.add(10);
        priorityQueueHighest.offer(100);
        priorityQueueHighest.offer(70);
        System.out.println(priorityQueueHighest);
        System.out.println(priorityQueueLowest);
    }

}
