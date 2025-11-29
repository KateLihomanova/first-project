package practice_6.TreeSet.task2_TreeSet;

import java.util.TreeSet;

public class task2_TreeSet {
    private TreeSet<Integer> intTreeSet;

    public task2_TreeSet() {
        this.intTreeSet = new TreeSet<>();
    }

    public void addUniqueNumbers(int num) {
        if (intTreeSet.contains(num)) {
            System.out.println(num + " такое значение уже есть в данном множестве");
        }
        else {
            intTreeSet.add(num);
        }
    }

    public void printPerTreeSet() {
        System.out.println(intTreeSet);
    }

}
