package practice_8.StreamAPI.aggregatingOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class task4_aggregatingOperations {
    public static void main(String[] args) {
        List<String> newStringList = new ArrayList<>(List.of("Кошка", "Бар", "Собака", "Барби", "Книга"));

        Optional<String> stringWith = newStringList.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst()
                .orElse("Нет подходящих элементов").describeConstable();

        System.out.println(stringWith);



    }
}
