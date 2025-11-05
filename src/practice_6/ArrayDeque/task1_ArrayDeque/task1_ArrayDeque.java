package practice_6.ArrayDeque.task1_ArrayDeque;

import java.util.ArrayDeque;

public class task1_ArrayDeque {
    private ArrayDeque<Integer> myArrayDeque;

    public task1_ArrayDeque() {
        this.myArrayDeque = new ArrayDeque<>();
    }

    public void addNumInMyArrayDequeue(int num) {
        myArrayDeque.add(num);
    }
     public void printMyArrayDequeue() {
        System.out.println(myArrayDeque);
     }
}
