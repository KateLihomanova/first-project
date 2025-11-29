package practice_8.StreamAPI.baseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class task4_baseOperations {
    public static void main(String[] args) {
        List<Integer> myNum = new ArrayList<>(List.of(1, 2, 3, 4));

        System.out.println(myNum.stream()
                .map(n -> Math.pow(n, 2))
                .collect(Collectors.toList()));
    }
}
