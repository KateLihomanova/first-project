package practice_6.HashSet.task2_HashSet;

import java.util.HashSet;

public class task2_HashSet {
    private HashSet<Integer> mySet;

    public task2_HashSet() {
        this.mySet = new HashSet<>();
    }

    public void addNumbers(int num) {
        mySet.add(num);
    }

    public void containsNumber(int num) {
        if (mySet.contains(num)) {
            System.out.println(num + " содержится в множестве");
        }
        else {
            System.out.println("Такого числа в множесте нет");
        }
    }
}
