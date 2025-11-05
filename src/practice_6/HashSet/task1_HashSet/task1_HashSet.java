package practice_6.HashSet.task1_HashSet;

import java.util.HashSet;

public class task1_HashSet {
    private HashSet<Integer> mySet;

    public task1_HashSet() {
        this.mySet = new HashSet<>();
    }

    public void addNumbers(int num) {
        mySet.add(num);
    }
    public void printSet() {
        System.out.println(mySet);
    }
}
