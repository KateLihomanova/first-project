package practice_8.StreamAPI.aggregatingOperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class task2_aggregatingOperations {
    public static void main(String[] args) {
        List<Integer> minNumber = new ArrayList<>(List.of(1, 3, 4, 90, 0));

        Optional<Integer> minResult = minNumber.stream()
                .min(Comparator.naturalOrder());

        if(minResult.isPresent()) {
            System.out.println(minResult.get());
        }

    }
}
