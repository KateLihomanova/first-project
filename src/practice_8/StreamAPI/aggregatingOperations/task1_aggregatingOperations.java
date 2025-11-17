package practice_8.StreamAPI.aggregatingOperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class task1_aggregatingOperations {
    public static void main(String[] args) {
        List<Integer> maxNum = new ArrayList<>(List.of(1, 90, 9, 65));

        Optional<Integer> result = maxNum.stream()
                .max(Comparator.naturalOrder());

        if(result.isPresent()) {
            System.out.println(result.get());
        }

    }
}
