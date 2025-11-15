package practice_8.StreamAPI.aggregatingOperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class task1_aggregatingOperations {
    public static void main(String[] args) {
        List<Integer> maxNum = new ArrayList<>(List.of(2, 5, 34, 55, 90));

        System.out.println(maxNum.stream()
                .max(Comparator.naturalOrder())
                .get());
    }
}
