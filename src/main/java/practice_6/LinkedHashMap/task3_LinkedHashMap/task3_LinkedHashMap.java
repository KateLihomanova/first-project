package practice_6.LinkedHashMap.task3_LinkedHashMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class task3_LinkedHashMap {
    private LinkedHashMap<String, String> history;

    public task3_LinkedHashMap() {
        this.history = new LinkedHashMap<>();
    }

    public void addHistory(String ID, String pageName) {
        List<String> keys = new ArrayList<>((history.keySet()));
        if(history.size() < 10) {
            history.put(ID, pageName);
        }
        else {
            history.remove(keys.get(0));
            history.put(ID, pageName);
        }
    }

    public void printHistory() {
        for(Map.Entry<String, String> entry : history.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
