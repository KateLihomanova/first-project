package practice_6.LinkedHashSet.task2_LinkedHashSet;

import java.util.LinkedHashSet;

public class task2_LinkedHashSet {
    private LinkedHashSet<String> mySet;

    public task2_LinkedHashSet() {
        this.mySet = new LinkedHashSet<>();
    }

    public void addUnique(String newString) {
        if (mySet.contains(newString)){
            System.out.println("Такой элемент уже есть в данном множестве");
        }
        else {
            mySet.add(newString);
        }
    }

    public void printInfoSet() {
        System.out.println(mySet);
    }
}
