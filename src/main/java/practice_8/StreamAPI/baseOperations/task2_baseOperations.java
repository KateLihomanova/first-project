package practice_8.StreamAPI.baseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class task2_baseOperations {
    public static void main(String[] args) {
        List<Integer> myNumbers = new ArrayList<>(List.of(10, 15, 25, 44, 34, 78));

        System.out.println(myNumbers.stream()
                .filter(x -> x%5 == 0)
                .collect(Collectors.toList()));

    }
}
