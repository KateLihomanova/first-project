package practice_12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {
    private final UserValidator userValidator = new UserValidator();

    @BeforeEach
    void enableValidation() {
        UserValidator.validationEnabled = true;
    }

    @Test
    void testValidatorUser() {
        User newUser = new User("Kate", 19, "kate@nobugs.ru");
        assertDoesNotThrow(() -> userValidator.validator(newUser));

    }
    @Test
    void testValidatorUserEmptyName() {
        User newUser = new User("", 76, "kate@nobugs.ru");
        assertThrows(InvalidUserException.class, () -> userValidator.validator(newUser));
    }

    @Test
    void testValidatorUserLowercaseName() {
        User newUser = new User("kate", 19, "kate@nobugs.ru");
        assertThrows(InvalidUserException.class, () -> userValidator.validator(newUser));
    }

    @Test
    void testValidatorYoungAge() {
        User newUser = new User("Kate", 17, "kate@nobugs.ru");
        assertThrows(InvalidUserException.class, () -> userValidator.validator(newUser));
    }

    @Test
    void testValidatorOldAge() {
        User newUser = new User("Kate", 101, "kate@nobugs.ru");
        assertThrows(InvalidUserException.class, () -> userValidator.validator(newUser));

    }

    @Test
    void testValidatorEmail() {
        User newUser = new User("Kate", 101, "katenobugs.ru");
        assertThrows(InvalidUserException.class, () -> userValidator.validator(newUser));

    }

    @Test
    void testValidatorDisabled() {
        User newUser = new User("Kate", 19, "kate@nobugs.ru");
        UserValidator.validationEnabled = false;
        assertDoesNotThrow(() -> userValidator.validator(newUser));


    }



}
