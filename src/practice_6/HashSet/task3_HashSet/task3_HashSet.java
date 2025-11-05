package practice_6.HashSet.task3_HashSet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class task3_HashSet {

    public void removeDuplicates(List<String> input) {
        HashSet<String> mySet = new HashSet<>();
        mySet.addAll(input);
        System.out.println(mySet);


    }
}
