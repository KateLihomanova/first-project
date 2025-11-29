package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class isEvenTest extends task10Test {

    @ParameterizedTest
    @ValueSource(ints = {2, 1002, 66, 0, -4, -106})
    public void userCanCheckIfNumisEven(int initialNum) {
        boolean actualResult = task.isEven(initialNum);

        assertTrue(actualResult);

    }

    @ParameterizedTest
    @ValueSource(ints = {3, 1009, 71, -9, -19})
    public void userCanCheckIfNumisNotEven(int initialNum) {
        boolean actualResult = task.isEven(initialNum);

        assertFalse(actualResult);

    }
}