package practice_6.LinkedList.task4_LinkedList;

import java.util.LinkedList;

public class task4_LinkedList {
    private LinkedList<Integer> numbers;

    public task4_LinkedList() {
        this.numbers = new LinkedList<>();
    }

    public void addNumbers(int num) {
        numbers.add(num);
    }

    public void sumOfNumbers() {
        int sumNumbers = 0;
        for (int i: numbers) {
            sumNumbers = sumNumbers + i;
        }
        System.out.println(sumNumbers);
    }
}
