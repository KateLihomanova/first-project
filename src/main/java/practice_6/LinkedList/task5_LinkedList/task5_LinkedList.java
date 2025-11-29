package practice_6.LinkedList.task5_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class task5_LinkedList {
    private LinkedList<Integer> iteratorsNumber = new LinkedList<>(List.of(2, 4, 5, 9, 3));
    ListIterator<Integer> it = iteratorsNumber.listIterator();

    public void iterateForward() {
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

    public void iterateBack() {
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }





}
