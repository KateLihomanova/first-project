package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isValidPhoneNumberTest extends task10Test {

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890", "+2 1230067390", "+5 1231111180"})
    public void validPhoneNumber(String number) {
        assertTrue(task.isValidPhoneNumber(number));


    }

    @ParameterizedTest
    @ValueSource(strings = {"+1 1", " ", "12345"})
    public void notValidPhoneNumber(String number) {
        assertFalse(task.isValidPhoneNumber(number));


    }
}
