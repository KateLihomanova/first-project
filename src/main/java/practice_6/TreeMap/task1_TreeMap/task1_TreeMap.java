package practice_6.TreeMap.task1_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class task1_TreeMap {
    private TreeMap<String, Integer> table;

    public task1_TreeMap() {
        this.table = new TreeMap<>();
    }

    public void addNameMark(String name, int mark) {
        table.put(name, mark);
    }

    public void printTable() {
        for(Map.Entry<String, Integer> entry : table.entrySet()){
            System.out.println(entry);
        }
    }
}
