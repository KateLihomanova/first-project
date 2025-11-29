package practice_8.funcInterface;

import java.util.function.Consumer;

public class task5_funcInterface {
    public static void main(String[] args) {
        Consumer<String> printString = (newString) -> {
            System.out.println(newString);
        };

        printString.accept("Love");
    }
}
