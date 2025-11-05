package practice_6.TreeMap.task3_TreeMap;

import java.util.TreeMap;

public class task3_TreeMap {
    private TreeMap<Integer, String> employeeID;

    public task3_TreeMap() {
        this.employeeID = new TreeMap<>();
    }

    public void addID(int id, String name) {
        employeeID.put(id, name);
    }

    public void higherKey(int id) {
        if(employeeID.higherKey(id) == null) {
            System.out.println("Более высокого ID нет");
        }
        else {
            System.out.println(employeeID.higherKey(id));
        }
    }
}
