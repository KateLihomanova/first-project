package practice_6.TreeMap.task2_TreeMap;

import java.util.TreeMap;

public class task2_TreeMap {
    private TreeMap<Integer, String> marks;

    public task2_TreeMap() {
        this.marks = new TreeMap<>();
    }

    public void addMarks(int mark, String name) {
        marks.put(mark, name);
    }

    public void printMinMax() {
        System.out.println("Минимальный ключ = " + marks.firstKey());
        System.out.println("Максимальный ключ = " + marks.lastKey());
    }
}
