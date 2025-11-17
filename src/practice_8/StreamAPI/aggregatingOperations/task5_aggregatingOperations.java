package practice_8.StreamAPI.aggregatingOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class task5_aggregatingOperations {
    public static void main(String[] args) {
        List<Integer> newMyList = new ArrayList<>(List.of(1, 3, 5, 55, 6, 45, 35, 25));

        Optional<Integer> myResult = newMyList.stream()
                .filter(n -> n%5 == 0)
                .findAny()
                .orElse(0).describeConstable();

        System.out.println(myResult);
    }
}
