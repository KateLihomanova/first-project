package practice_8.StreamAPI.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class task3_grouping {
    public static void main(String[] args) {
        List<Integer> averageList = new ArrayList<>(List.of(3, 4, 8, 1, 4));

        System.out.println(averageList.stream()
                .collect(Collectors.averagingInt(n -> n)));
    }
}
