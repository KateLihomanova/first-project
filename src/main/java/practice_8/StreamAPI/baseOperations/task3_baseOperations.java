package practice_8.StreamAPI.baseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class task3_baseOperations {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(List.of("love", "cat", "dog", "family"));

        System.out.println(myList.stream()
                .map(s -> s.length())
                .collect(Collectors.toList()));
    }
}
