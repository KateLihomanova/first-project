package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class factorialTest extends task10Test {

    public static Stream<Arguments> factorialNumbers() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("factorialNumbers")
    public void validFactorialNumbers(int number, int result) {
        assertEquals(task.factorial(number), result);

    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -3, -77})
    public void NegativeFactorialNumbers(int negativeNumber) {
        assertThrows(IllegalArgumentException.class, () -> task.factorial(negativeNumber));
    }
}
