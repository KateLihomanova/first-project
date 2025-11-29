package practice_8.funcInterface;

import java.util.function.Function;

public class task4_funcInterface {
    public static void main(String[] args) {
        Function<String, Integer> stringSize = (myString) -> {
            return myString.length();
        };

        System.out.println(stringSize.apply("I love Java"));
    }
}
