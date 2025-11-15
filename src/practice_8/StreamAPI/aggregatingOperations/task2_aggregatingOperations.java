package practice_8.StreamAPI.aggregatingOperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class task2_aggregatingOperations {
    public static void main(String[] args) {
        List<Integer> minNumber = new ArrayList<>(List.of(1, 3, 4, 90, 0));

        System.out.println(minNumber.stream()
                .min(Comparator.naturalOrder())
                .get());
    }
}
