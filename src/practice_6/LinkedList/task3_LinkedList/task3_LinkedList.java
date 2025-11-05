package practice_6.LinkedList.task3_LinkedList;

import java.util.LinkedList;

public class task3_LinkedList {
    private LinkedList<String> myStrings;

    public task3_LinkedList() {
        this.myStrings = new LinkedList<>();
    }

    public void addString(String newString) {
        myStrings.add(newString);
    }
     public void printFirstLast() {
        System.out.println(myStrings.getFirst());
        System.out.println(myStrings.getLast());

     }
}
