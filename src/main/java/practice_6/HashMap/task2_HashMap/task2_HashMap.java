package practice_6.HashMap.task2_HashMap;

import java.util.HashMap;

public class task2_HashMap {
    private HashMap<String, Integer> myMap;

    public task2_HashMap() {
        this.myMap = new HashMap<>();
    }

    public void addKeyValue(String key, int value) {
        myMap.put(key, value);
    }

    public void containsName(String key) {
        if (myMap.containsKey(key)) {
            System.out.println("Такое имя есть");
        }
        else {
            System.out.println("Такого имени нет");
        }

    }
}
