package practice_11;
import java.util.*;
public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.startsWith("A")) {
                iter.remove();
            }
        }
    }
    }

