package practice_6.ArrayDeque.task3_ArrayDeque;

public class Main {
    public static void main(String[] args) {
        task3_ArrayDeque task3 = new task3_ArrayDeque();
        task3.addFirst("First1");
        task3.addFirst("First2");
        task3.addLast("Last1");
        task3.addLast("Last2");

        task3.removeFirst();
        task3.removeLast();
    }
}
