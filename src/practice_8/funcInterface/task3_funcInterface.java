package practice_8.funcInterface;

import java.util.function.Predicate;

public class task3_funcInterface {
    public static void main(String[] args) {
        Predicate<Integer> evenNumber = (x) -> {
            return x % 2 == 0;
        };

        System.out.println(evenNumber.test(7));
        System.out.println(evenNumber.test(2));

    }
}
