package practice_6.LinkedHashSet.task1_LinkedHashSet;

import java.util.LinkedHashSet;

public class task1_LinkedHashSet {
    private LinkedHashSet<String> mySet;

    public task1_LinkedHashSet() {
        this.mySet = new LinkedHashSet<>();
    }

    public void addString(String newString) {
        mySet.add(newString);
    }

    public void printInfoSet() {
        System.out.println(mySet);
    }
}
