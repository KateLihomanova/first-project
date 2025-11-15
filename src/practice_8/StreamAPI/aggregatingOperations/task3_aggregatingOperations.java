package practice_8.StreamAPI.aggregatingOperations;

import java.util.ArrayList;
import java.util.List;

public class task3_aggregatingOperations {
    public static void main(String[] args) {
        List<Integer> sumNumbers = new ArrayList<>(List.of(1, 3, 2, 4));

        System.out.println(sumNumbers.stream()
                .mapToLong(n -> n)
                .sum());
    }
}
