package practice_6.ArrayDeque.task3_ArrayDeque;

import java.util.ArrayDeque;

public class task3_ArrayDeque {
    private ArrayDeque<String> reverseDeque;

    public task3_ArrayDeque() {
        this.reverseDeque = new ArrayDeque<>();
    }

    public void addFirst(String word) {
        reverseDeque.addFirst(word);
    }
    public void addLast(String word) {
        reverseDeque.addLast(word);
    }

    public void removeFirst() {
        reverseDeque.removeFirst();
        System.out.println(reverseDeque);

    }
    public void removeLast() {
        reverseDeque.removeLast();
        System.out.println(reverseDeque);
    }


    }

