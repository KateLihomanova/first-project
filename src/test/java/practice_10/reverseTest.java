package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class reverseTest extends task10Test {

    public static Stream<Arguments> validStringToReverse() {
        return Stream.of(
                Arguments.of("abba", "abba"),
                Arguments.of("lovE", "Evol"),
                Arguments.of("WEAR", "RAEW"),
                Arguments.of("", ""),
                Arguments.of(null, null));
    }

    @ParameterizedTest
    @MethodSource("validStringToReverse")
    public void userCanReversValidString(String initial, String expected) {
        String actualResult = task.reverse(initial);

        assertEquals(expected, actualResult);

    }


}
