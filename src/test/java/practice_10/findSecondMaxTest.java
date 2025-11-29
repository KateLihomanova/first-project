package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class findSecondMaxTest extends task10Test {

    public static Stream<Arguments> arraysForFindMaxSecond() {

        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, 3),
                Arguments.of(new int[]{33, 55, 77, 99}, 77),
                Arguments.of(new int[]{-11,-22,-44}, -22));
    }

    @ParameterizedTest
    @MethodSource("arraysForFindMaxSecond")
    public void findSecondMaxInArray(int[] myArray, int secondMaxNumber) {
        assertEquals(task.findSecondMax(myArray), secondMaxNumber);

    }

    @Test
    public void findMaxInArrayWithSingleValue() {
        assertThrows(IllegalArgumentException.class, () -> {task.findSecondMax(new int[]{1});}, "Find max in an Array with a single value should lead to IllegalArgumentException");
    }

    @Test
    public void findMaxInArrayWithSameValues() {
        assertThrows(NoSuchElementException.class, () -> {task.findSecondMax(new int[]{12,12,12,12});}, "Find max in an Array with the same values should lead to NoSuchElementException");
    }


}
