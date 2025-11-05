package practice_6.LinkedList.task1_LinkedList;

import java.util.LinkedList;

public class task1_LinkedList {
    private LinkedList<String> stringList;

    public task1_LinkedList() {
        this.stringList = new LinkedList<>();
    }

    public void addString(String newString) {
        stringList.add(newString);
    }

    public void printList() {
        System.out.println(stringList);
    }
}
