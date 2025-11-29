package practice_6.HashSet.task3_HashSet;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        task3_HashSet task3 = new task3_HashSet();
        LinkedList<String> listOfNames= new LinkedList<>(List.of("Kate", "Kate", "Kate", "Ivan"));
        task3.removeDuplicates(listOfNames);
    }
}
