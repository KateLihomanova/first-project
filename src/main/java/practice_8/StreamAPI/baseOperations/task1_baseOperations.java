package practice_8.StreamAPI.baseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class task1_baseOperations {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("пёс", "любовь", "сингл", "женщина", "кот", "яркость"));

        System.out.println(words.stream()
                .filter(w -> w.length() > 5)
                .collect(Collectors.toList()));

    }
}
