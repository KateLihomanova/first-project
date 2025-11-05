package practice_6.LinkedHashMap.task1_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class task1_LinkedHashMap {
    private LinkedHashMap<String, Integer> myBook;

    public task1_LinkedHashMap() {
        this.myBook = new LinkedHashMap<>();
    }

    public void addNameAge(String name, int age) {
        myBook.put(name, age);
    }

    public void printMyBook() {
        for(Map.Entry<String, Integer> entry : myBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


}
