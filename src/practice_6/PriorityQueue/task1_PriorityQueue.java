package practice_6.PriorityQueue;

import java.util.PriorityQueue;

public class task1_PriorityQueue {
    private PriorityQueue<Integer> myQueue;

    public task1_PriorityQueue() {
        this.myQueue = new PriorityQueue<>();
    }

    public void addNumInQueue(int num) {
        myQueue.add(num);

    }
    public void printMyQueue() {
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.poll());
        }
    }
}
