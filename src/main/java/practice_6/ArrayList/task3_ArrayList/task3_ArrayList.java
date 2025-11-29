package practice_6.ArrayList.task3_ArrayList;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class task3_ArrayList {
    private ArrayList<String> listForString;

    public task3_ArrayList() {
        this.listForString = new ArrayList<>();
    }

    public void addString(String newString) {
        listForString.add(newString);
    }

    public void findMaxString() {
        AtomicReference<Integer> lengthString = new AtomicReference<>(0);
        AtomicReference<String> string = new AtomicReference<>("");
        listForString.forEach(
               i -> {
                   if (i.length() > lengthString.get()) {
                       lengthString.set(i.length());
                       string.set(i);
                   }
               }
        );
        System.out.println(string);
    }
}
