package practice_6.ArrayDeque.task2_ArrayDeque;

import java.util.ArrayDeque;

public class task2_ArrayDeque {
    private ArrayDeque<Integer> myStack;

    public task2_ArrayDeque() {
        this.myStack = new ArrayDeque<>();
    }

    public void addNumInMyStack(int num) {
        myStack.push(num);
    }

    public void removeElements(){
        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
    }
}
