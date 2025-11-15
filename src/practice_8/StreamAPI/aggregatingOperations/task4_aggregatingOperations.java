package practice_8.StreamAPI.aggregatingOperations;

import java.util.ArrayList;
import java.util.List;

public class task4_aggregatingOperations {
    public static void main(String[] args) {
        List<String> newStringList = new ArrayList<>(List.of("Кошка", "Бар", "Собака", "Барби", "Книга"));

        System.out.println(newStringList.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst());
    }
}
