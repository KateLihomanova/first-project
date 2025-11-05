package practice_6.TreeSet.task3_TreeSet;

import java.util.TreeSet;

public class task3_TreeSet {
    private TreeSet<Integer> minMaxSet;

    public task3_TreeSet() {
        this.minMaxSet = new TreeSet<>();
    }

    public void addMinMaxSet(int num) {
        minMaxSet.add(num);
    }

    public void higher(int value) {
        if(value != 0) {
            System.out.println(minMaxSet.higher(value));
        }
        else {
            System.out.println("Нет большего числа.");
        }
    }


    public void lower(int value) {
        if (value != 0) {
            System.out.println(minMaxSet.lower(value));
        }
        else {
            System.out.println("Нет меньшего числа");
        }
    }

}
