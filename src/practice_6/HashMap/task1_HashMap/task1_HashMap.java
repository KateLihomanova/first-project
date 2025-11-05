package practice_6.HashMap.task1_HashMap;

import java.util.HashMap;

public class task1_HashMap {
    private HashMap<String, Integer> nameAge;

    public task1_HashMap() {
        this.nameAge = new HashMap<>();
    }

    public void addNameAge(String name, int age) {
        nameAge.put(name, age);
    }

    public void printNameAge() {
        System.out.println(nameAge);
    }
}
