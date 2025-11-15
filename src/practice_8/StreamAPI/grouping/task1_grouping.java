package practice_8.StreamAPI.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class task1_grouping {
    public static void main(String[] args) {
        List<String> myFirstChar = new ArrayList<>(List.of("love", "list", "tree", "table", "cat"));

        System.out.println(myFirstChar.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0))));

    }
}
