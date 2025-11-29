package practice_6.ArrayList.task4_ArrayList;

import java.util.ArrayList;

public class task4_ArrayList {
    private ArrayList<Integer> numbers;

    public task4_ArrayList() {
        this.numbers = new ArrayList<>();
    }

    public void addNumbers(int num) {
        numbers.add(num);
    }

    public void sumNumbers() {
        int summ = 0;
        for(int i: numbers) {
            summ = summ + i;
        }
        System.out.println(summ);
    }

}
