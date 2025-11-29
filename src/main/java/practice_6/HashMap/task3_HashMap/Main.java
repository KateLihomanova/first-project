package practice_6.HashMap.task3_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> nameBook = Map.of("Kate", 12,
                "Bob", 18,
                "Alex", 17,
                "Ivan", 20);
        task3_HashMap task3 = new task3_HashMap();
        task3.printUnderage(nameBook);


    }
}
