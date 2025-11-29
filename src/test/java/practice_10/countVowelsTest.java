package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class countVowelsTest extends task10Test {

    public static Stream<Arguments> validStringsToCount() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("", 0),
                Arguments.of("e", 1),
                Arguments.of("AEIOU", 5));
    }
    public static Stream<Arguments> notValidStringsToCount() {
        return Stream.of(
                Arguments.of("hll", 0),
                Arguments.of("r", 0),
                Arguments.of("ZQWSDF", 0));
    }

    @ParameterizedTest
    @MethodSource("notValidStringsToCount")
    public void userCanNotCountVowels(String initial, int countVowels) {
        int expectedResult = task.countVowels(initial);

        assertEquals(expectedResult, countVowels);
    }

    @Test
    public void userCanNotCountVowelsNull() {
        assertThrows(IllegalArgumentException.class, () -> {task.countVowels(null);}, "Counting vowels for null should lead to IllegalArgumentException");
    }
}
