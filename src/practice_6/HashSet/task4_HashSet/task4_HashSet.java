package practice_6.HashSet.task4_HashSet;

import java.util.HashSet;

public class task4_HashSet {
    private HashSet<String> names;

    public task4_HashSet() {
        this.names = new HashSet<>();
    }

    public void addNames(String name) {
        names.add(name);
    }

    public void containName(String name) {
        if (names.contains(name)) {
            System.out.println(name + " есть в списке имен");
        }
        else {
            System.out.println(name + " такого именни нет в списке");
        }
    }
}
