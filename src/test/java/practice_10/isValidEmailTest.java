package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isValidEmailTest extends task10Test {

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "bad@true.com", "st@g.com"})
    public void ValidEmail(String email) {
        assertTrue(task.isValidEmail(email));

    }

    @ParameterizedTest
    @ValueSource(strings = {"testexample.com", "bad@.com", ".com"})
    public void NotValidEmail(String email) {
        assertFalse(task.isValidEmail(email));

    }

    @Test
    public void NullEmail() {
        assertFalse(task.isValidEmail(null));
    }

}

