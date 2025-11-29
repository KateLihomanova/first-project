package practice_8.StreamAPI.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class task2_grouping {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(List.of(2, 44, 3, 99, 100, 45, 36));

        System.out.println(num.stream()
                .collect(Collectors.groupingBy(n -> n%2 == 0)));
    }
}
