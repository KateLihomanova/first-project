package practice_6.HashMap.task3_HashMap;

import java.util.HashMap;
import java.util.Map;

public class task3_HashMap {
    public void printUnderage(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry.getKey()  + " " + entry.getValue());
            }

        }
    }
}
