package practice_6.TreeSet.task1_TreeSet;

import java.util.TreeSet;

public class task1_TreeSet {
    private TreeSet<Integer> myTreeSet;

    public task1_TreeSet() {
        this.myTreeSet = new TreeSet<>();
    }

    public void addNumToSet(int num) {
        myTreeSet.add(num);
    }
     public void printMySet() {
        System.out.println(myTreeSet);
     }
}
