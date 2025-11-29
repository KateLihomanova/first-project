package practice_6.ArrayList.task1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class task1_ArrayList {
    private ArrayList<Integer> numbers = new ArrayList<>(List.of(2, 4, 5, 9, 3));

    public void addLastNumber(int num) {

        numbers.add(num);
    }

    public void printNumbers() {

        System.out.println(numbers);
    }


}
