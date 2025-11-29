package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isLeapYearTest extends task10Test {

    @ParameterizedTest
    @ValueSource(ints = {2000, 2020, 1600})
    public void isLeapYearTrue(int year) {
        assertTrue(task.isLeapYear(year));

    }

    @ParameterizedTest
    @ValueSource(ints = {2001, 2021, 1601})
    public void isLeapYearFalse(int year) {
        assertFalse(task.isLeapYear(year));

    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100})
    public void isLeapYearDividedOnlyHundred(int year) {
        assertFalse(task.isLeapYear(year));

    }
}
