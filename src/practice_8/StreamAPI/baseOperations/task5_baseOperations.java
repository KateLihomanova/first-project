package practice_8.StreamAPI.baseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class task5_baseOperations {
    public static void main(String[] args) {
        List<Integer> setList = new ArrayList<>(List.of(1, 2, 2, 3, 3, 1, 5, 5, 3));

        System.out.println(setList.stream()
                .distinct()
                .collect(Collectors.toList()));
    }
}
