package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class findMaxTest extends task10Test {

    public static Stream<Arguments> arraysForFindMax() {

        return Stream.of(
                Arguments.of(new int[]{1,2,3}, 3),
                Arguments.of(new int[]{33}, 33),
                Arguments.of(new int[]{-11,-22,-44}, -11));
    }

    @ParameterizedTest
    @MethodSource("arraysForFindMax")
    public void findMaxInArray(int[] myArray, int maxNumber) {
        assertEquals(task.findMax(myArray), maxNumber);

    }

    @Test
    public void findMaxInEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> {task.findMax(new int[]{});}, "Find max in empty Array should lead to NoSuchElementException");
    }
}
